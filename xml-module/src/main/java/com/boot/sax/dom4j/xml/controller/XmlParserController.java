package com.boot.sax.dom4j.xml.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/11/23 - 上午9:27
 */
@RestController
@RequestMapping(value = "/xml")
public class XmlParserController {

    /**
     * TODO 解析xml
     *
     * @return
     */
    @GetMapping("/parse")
    public String parseXml() {
        return "";
    }
}
