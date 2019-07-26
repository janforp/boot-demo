package com.janita.share.requestattributes.service;

import com.boot.demo.common.util.CommonUtils;
import com.janita.share.requestattributes.RequestAttributesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-26 - 14:08
 */
@Service
public class ShareService {

    @Autowired
    private ServiceHelper helper;

    public String sendEmail(String userId) throws InterruptedException {
        String password = RequestAttributesContext.getByKey(RequestAttributesContext.PASS_WORD);
        CommonUtils.print("ShareService获取的密码 = " + password);
        helper.sendEmail(userId);
        return "success";
    }
}
