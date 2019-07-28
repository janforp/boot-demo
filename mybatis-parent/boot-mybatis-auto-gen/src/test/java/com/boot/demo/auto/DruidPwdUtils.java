package com.boot.demo.auto;

import com.alibaba.druid.filter.config.ConfigTools;
import org.junit.Test;

/**
 * 类说明：
 *
 p.main.password=hXRRGzpOIDa0l4YxjPWgZPPjDBr9HLQ3J7wq4KfJxP/1tgedra+0r5x2LsfVn4SQeySZ4+C/7i2+6zayi1+bBQ==
 p.main.publickey=MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAImLDGUY+/K53suxvHKPPfecOwSz9tNKpGQMMt7tkfnOwZjAQdZ5o9IbqSRPSXmEGqeHkntGtTm4HoGbQOKt9IMCAwEAAQ==
 #ftp
 *
 * @author janita
 * @since 2018/10/10 - 下午8:12
 */
public class DruidPwdUtils {

    private static final String PUBLIC_KEY = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAImLDGUY+/K53suxvHKPPfecOwSz9tNKpGQMMt7tkfnOwZjAQdZ5o9IbqSRPSXmEGqeHkntGtTm4HoGbQOKt9IMCAwEAAQ==";

    @Test
    public void decrypt() throws Exception {

        String word = "hXRRGzpOIDa0l4YxjPWgZPPjDBr9HLQ3J7wq4KfJxP/1tgedra+0r5x2LsfVn4SQeySZ4+C/7i2+6zayi1+bBQ==";
        String desc = ConfigTools.decrypt(word);
        System.out.println(desc);
    }

    @Test
    public void encrypt() throws Exception {
        String password = "hswy_basic";
        String enc = ConfigTools.encrypt(PUBLIC_KEY, password);
        System.out.println(enc);
    }
}
