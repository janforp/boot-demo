package com.janita.share.requestattributes.controller;

import com.janita.share.requestattributes.RequestAttributesContext;
import com.janita.share.requestattributes.service.ServiceHelper;
import com.janita.share.requestattributes.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.janita.share.requestattributes.RequestAttributesContext.PASS_WORD;

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
    private ShareService shareService;

    @GetMapping("/sendEmail")
    public String sendEmail(String userId) throws InterruptedException {
        RequestAttributesContext.setKeyValueToRequest(PASS_WORD, "123456");
        return shareService.sendEmail(userId);
    }
}
