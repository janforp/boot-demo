package com.janita.share.requestattributes.controller;

import com.janita.share.requestattributes.AuthContext;
import com.janita.share.requestattributes.service.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-26 - 13:30
 */
@RestController
@RequestMapping("/share")
public class ShareController {

    @Autowired
    private ServiceHelper serviceHelper;

    @GetMapping("/sendEmail")
    public String sendEmail(String userId) throws InterruptedException {
        AuthContext.setKeyValueToRequest("password", "123456");
        serviceHelper.sendEmail(userId);
        return "success";
    }
}
