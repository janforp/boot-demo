package com.boot.demo.listenerfilter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 类说明：
 *
 * @author janita
 * @date 2018/9/16 - 下午6:56
 */
@RestController
@RequestMapping("/filter")
public class FilterController {

    private static Map<String, HttpSession> map = new HashMap<String, HttpSession>();

    @GetMapping("/")
    public String filter() {
        return "filter";
    }

    @GetMapping("/createSession")
    public String createSession(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        session.setAttribute("token", "11111");
        map.put(session.getId(), session);
        return session.getId();
    }

    @GetMapping("/getToken/{sessionId}")
    public String getToken(@PathVariable String sessionId) {
        HttpSession httpSession = map.get(sessionId);
        return httpSession.getAttribute("token").toString();
    }

    @GetMapping("destroySession/{sessionId}")
    public String destroySession(@PathVariable String sessionId) {
        HttpSession httpSession = map.get(sessionId);
        httpSession.invalidate();
        return "success";
    }
}
