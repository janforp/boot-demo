package com.janita.weekly.controller;

import com.alibaba.fastjson.JSON;
import com.boot.demo.common.result.ResultDTO;
import com.boot.demo.common.util.HermesHttpUtils;
import com.janita.weekly.dto.DTO;
import com.janita.weekly.dto.DataDTO;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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

    @PostMapping("/c")
    public ResultDTO c(@RequestBody String s) {
        DTO dto = JSON.parseObject(s, DTO.class);
        DataDTO last = dto.getLast();
        DataDTO current = dto.getCurrent();

        //api前10名
        List<DataDTO.BodyBean.服务统计报表Bean.DataMapListBeanXXX> lastApiAll = last.getBody().get服务统计报表().getDataMapList();
        List<DataDTO.BodyBean.服务统计报表Bean.DataMapListBeanXXX> currentApiAll = current.getBody().get服务统计报表().getDataMapList();

        //dao前10
        List<DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX> lastDaoAll = last.getBody().get数据访问层统计().getDataMapList();
        List<DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX> currentDaoAll = current.getBody().get数据访问层统计().getDataMapList();



        return ResultDTO.toSuccess("sdfsdf");
    }

    private static List<DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX> getTop10(List<DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX> list) {
        list.sort(((o1, o2) -> {
            return Integer.valueOf(o2.getCOUNT无()).compareTo(Integer.valueOf(o1.getCOUNT无()));
        }));
        return list.stream().skip(10).collect(Collectors.toList());
    }

    private static List<DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX> getDaoAccessTop10(DataDTO dto) {
        List<DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX> dataMapList = dto.getBody().get数据访问层统计().getDataMapList();
        dataMapList.sort((o1, o2) -> o1.getCOUNT无().compareTo(o2.getCOUNT无()));
        return dataMapList.stream().limit(10).collect(Collectors.toList());
    }

    private static List<DataDTO.BodyBean.数据访问层异常统计Bean.DataMapListBean> getDaoErrorTop10(DataDTO dto) {
        List<DataDTO.BodyBean.数据访问层异常统计Bean.DataMapListBean> dataMapList = dto.getBody().get数据访问层异常统计().getDataMapList();
        dataMapList.sort((o1, o2) -> o1.getCOUNT无().compareTo(o2.getCOUNT无()));
        return dataMapList.stream().sorted((o1, o2) -> o1.getCOUNT无().compareTo(o2.getCOUNT无())).limit(10).collect(Collectors.toList());
    }

    private static List<DataDTO.BodyBean.服务统计报表Bean.DataMapListBeanXXX> getApiAccessTop10(DataDTO dto) {
        List<DataDTO.BodyBean.服务统计报表Bean.DataMapListBeanXXX> dataMapList = dto.getBody().get服务统计报表().getDataMapList();
        dataMapList.sort((o1, o2) -> o1.getCOUNT无().compareTo(o2.getCOUNT无()));
        return dataMapList.stream().limit(10).collect(Collectors.toList());
    }

    private static List<DataDTO.BodyBean.数据访问层异常统计Bean.DataMapListBean> getApiErrorTop10(DataDTO dto) {
        List<DataDTO.BodyBean.数据访问层异常统计Bean.DataMapListBean> dataMapList = dto.getBody().get数据访问层异常统计().getDataMapList();
        dataMapList.sort((o1, o2) -> o1.getCOUNT无().compareTo(o2.getCOUNT无()));
        return dataMapList.stream().limit(10).collect(Collectors.toList());
    }
}
