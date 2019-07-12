package com.janita.weekly.controller;

import com.alibaba.fastjson.JSON;
import com.boot.demo.common.result.ResultDTO;
import com.boot.demo.common.util.CommonUtils;
import com.boot.demo.common.util.HermesHttpUtils;
import com.google.common.collect.Lists;
import com.janita.weekly.dto.DTO;
import com.janita.weekly.dto.DataDTO;
import com.janita.weekly.dto.ErrorResultDTO;
import com.janita.weekly.dto.ResultDataDTO;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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

    @PostMapping("/createWeekReport")
    public ResultDTO createWeekReport(@RequestBody String s) {
        DTO dto = JSON.parseObject(s, DTO.class);
        DataDTO last = dto.getLast();
        DataDTO current = dto.getCurrent();

        //api前10名
        List<DataDTO.BodyBean.服务统计报表Bean.DataMapListBeanXXX> lastApiAll = last.getBody().get服务统计报表().getDataMapList();
        Map<String, DataDTO.BodyBean.服务统计报表Bean.DataMapListBeanXXX> lastApiMap = lastApiAll.stream()
            .collect(Collectors.toMap((item -> item.getServiceName() + "-" + item.getServiceMethodName()), Function.identity()));
        List<DataDTO.BodyBean.服务统计报表Bean.DataMapListBeanXXX> currentApiAll = current.getBody().get服务统计报表().getDataMapList();
        List<DataDTO.BodyBean.服务统计报表Bean.DataMapListBeanXXX> currentApiTop10 = getTopTen(currentApiAll);

        //dao前10
        List<DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX> lastDaoAll = last.getBody().get数据访问层统计().getDataMapList();
        Map<String, DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX> lastDaoMap =
            lastDaoAll.stream().collect(Collectors.toMap((item -> item.getDaoName() + "-" + item.getDaoMethodName()), Function.identity()));
        List<DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX> currentDaoAll = current.getBody().get数据访问层统计().getDataMapList();
        List<DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX> currentDaoTop10 = getTop10(currentDaoAll);


        List<DataDTO.BodyBean.服务异常统计Bean.DataMapListBeanXX> currentAllError = current.getBody().get服务异常统计().getDataMapList();
        List<DataDTO.BodyBean.服务异常统计Bean.DataMapListBeanXX> topTenError = getTopTenError(currentAllError);
        // List<ErrorResultDTO> top10ErrorList = topTenError.stream().map(item -> {
        //     ErrorResultDTO errorResultDTO = new ErrorResultDTO();
        //     errorResultDTO.setName(item.getServiceName() + "." + item.getServiceMethodName());
        //     errorResultDTO.setNum(item.getCOUNT无());
        //     return errorResultDTO;
        // }).collect(Collectors.toList());

        List<DataDTO.BodyBean.数据访问层异常统计Bean.DataMapListBean> currentAllDaoError = current.getBody().get数据访问层异常统计().getDataMapList();
        List<DataDTO.BodyBean.数据访问层异常统计Bean.DataMapListBean> top10DaoErrorList = getCurrentAllDaoError(currentAllDaoError);
        List<ErrorResultDTO> top10DaoErrorList2 = top10DaoErrorList.stream().map(item -> {
            ErrorResultDTO errorResultDTO = new ErrorResultDTO();
            errorResultDTO.setName(item.getDaoName() + "." + item.getDaoMethodName());
            errorResultDTO.setNum(item.getCOUNT无());
            return errorResultDTO;
        }).collect(Collectors.toList());

        //RPC top 10
        List<ResultDataDTO> apiList = Lists.newArrayListWithCapacity(10);
        for (final DataDTO.BodyBean.服务统计报表Bean.DataMapListBeanXXX currentDTO : currentApiTop10) {
            String key = currentDTO.getServiceName() + "-" + currentDTO.getServiceMethodName();
            DataDTO.BodyBean.服务统计报表Bean.DataMapListBeanXXX lastDTO = lastApiMap.get(key);
            ResultDataDTO resultDataDTO = ResultDataDTO.builder()
                .className(currentDTO.getServiceName())
                .methodName(currentDTO.getServiceMethodName())
                .currentWeekNum(currentDTO.getCOUNT无())
                .lastWeekNum(lastDTO.getCOUNT无())
                .numRiseRate(null)
                .currentWeekTime(currentDTO.getAVGelapsed())
                .lastWeekTime(lastDTO.getAVGelapsed())
                .timeRiseRate(null)
                .build();
            resultDataDTO.setNumRiseRate(get100Rate(resultDataDTO.getCurrentWeekNum(), resultDataDTO.getLastWeekNum()));
            resultDataDTO.setTimeRiseRate(get100Rate(resultDataDTO.getCurrentWeekTime(), resultDataDTO.getLastWeekTime()));
            apiList.add(resultDataDTO);
        }


        List<ResultDataDTO> daoList = Lists.newArrayListWithCapacity(10);
        for (final DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX currentDTO : currentDaoTop10) {
            String key = currentDTO.getDaoName() + "-" + currentDTO.getDaoMethodName();
            DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX lastDTO = lastDaoMap.get(key);
            ResultDataDTO resultDataDTO = ResultDataDTO.builder()
                .className(currentDTO.getDaoName())
                .methodName(currentDTO.getDaoMethodName())
                .currentWeekNum(currentDTO.getCOUNT无())
                .lastWeekNum(lastDTO.getCOUNT无())
                .numRiseRate(null)
                .currentWeekTime(currentDTO.getAVGelapsed())
                .lastWeekTime(lastDTO.getAVGelapsed())
                .timeRiseRate(null)
                .build();
            resultDataDTO.setNumRiseRate(get100Rate(resultDataDTO.getCurrentWeekNum(), resultDataDTO.getLastWeekNum()));
            resultDataDTO.setTimeRiseRate(get100Rate(resultDataDTO.getCurrentWeekTime(), resultDataDTO.getLastWeekTime()));
            daoList.add(resultDataDTO);
        }


        print("rpc", apiList);
        print("dao", daoList);

        printError("error", top10DaoErrorList2);

        return ResultDTO.toSuccess("success");
    }

    private static String get100Rate(String current, String last) {
        Double currentD = Double.valueOf(current);
        Double lastD = Double.valueOf(last);

        double value = currentD - lastD;
        double v = (value / lastD) * 100;
        BigDecimal bigDecimal = BigDecimal.valueOf(v).setScale(2, BigDecimal.ROUND_HALF_UP);
        return bigDecimal.toString() + "%";
    }

    private static List<DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX> getTop10(List<DataDTO.BodyBean.数据访问层统计Bean.DataMapListBeanX> list) {
        list.sort(((o1, o2) -> Integer.valueOf(o2.getCOUNT无()).compareTo(Integer.valueOf(o1.getCOUNT无()))));
        return list.stream().limit(10).collect(Collectors.toList());
    }

    private static List<DataDTO.BodyBean.服务统计报表Bean.DataMapListBeanXXX> getTopTen(
        List<DataDTO.BodyBean.服务统计报表Bean.DataMapListBeanXXX> list) {
        list.sort(((o1, o2) -> Integer.valueOf(o2.getCOUNT无()).compareTo(Integer.valueOf(o1.getCOUNT无()))));
        return list.stream().limit(10).collect(Collectors.toList());
    }

    private static List<DataDTO.BodyBean.服务异常统计Bean.DataMapListBeanXX> getTopTenError(
        List<DataDTO.BodyBean.服务异常统计Bean.DataMapListBeanXX> list) {
        list.sort(((o1, o2) -> Integer.valueOf(o2.getCOUNT无()).compareTo(Integer.valueOf(o1.getCOUNT无()))));
        return list.stream().limit(10).collect(Collectors.toList());
    }

    private static List<DataDTO.BodyBean.数据访问层异常统计Bean.DataMapListBean> getCurrentAllDaoError(
        List<DataDTO.BodyBean.数据访问层异常统计Bean.DataMapListBean> list) {
        list.sort(((o1, o2) -> Integer.valueOf(o2.getCOUNT无()).compareTo(Integer.valueOf(o1.getCOUNT无()))));
        return list.stream().limit(10).collect(Collectors.toList());
    }

    private static void print(String name, List<ResultDataDTO> list) {
        CommonUtils.print(name);
        for (final ResultDataDTO resultDataDTO : list) {
            System.out.println(resultDataDTO);
        }
    }

    private static void printError(String name, List<ErrorResultDTO> list) {
        CommonUtils.print(name);
        for (final ErrorResultDTO resultDataDTO : list) {
            System.out.println(resultDataDTO);
        }
    }
}
