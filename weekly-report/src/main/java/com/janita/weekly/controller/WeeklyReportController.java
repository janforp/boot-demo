package com.janita.weekly.controller;

import com.boot.demo.common.util.HermesHttpUtils;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-05 - 14:41
 */
@RestController
@RequestMapping("/weekly")
public class WeeklyReportController {

    @Value("${report.url}")
    private String reportUrl;

    @GetMapping("/report")
    public Object report(String startDate, String endDate, String cook) throws Exception {
        Header[] headers = new Header[1];
        reportUrl = reportUrl.replace("STARTDATE", startDate).replace("ENDDATE", endDate);
        Header header = new Header() {
            @Override
            public HeaderElement[] getElements() throws ParseException {
                return new HeaderElement[0];
            }

            @Override
            public String getName() {
                return "Cookie";
            }

            @Override
            public String getValue() {
                return cook;
            }
        };
        headers[0] = header;
        String s = HermesHttpUtils.doGet(reportUrl, new HashMap<>(), headers, "", 1);
        return s;
    }
}
