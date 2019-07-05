package com.boot.demo.common.util;

import com.servyou.elephant.utils.HttpUtils;
import com.servyou.japter.Japter;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;

import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * @author zhangshuo
 * @since 1.0.0, 2017/08/17
 */
public class HermesHttpUtils {
    /**
     * 发送http post请求
     *
     * @param url       url地址
     * @param formData  post表单中的内容
     * @param json      post body中的内容，已转换成json字符串
     * @param proxyHost 代理服务器ip地址
     * @param proxyPort 代理服务器端口
     */
    public static String doPost(String url, Map<String, Object> formData, String json, String proxyHost, int proxyPort) {

        if (null == url) {
            return "";
        }
        if (null == json) {
            json = "";
        }
        url = joinUrl(url, formData);
        HttpEntity httpEntity = new StringEntity(json, StandardCharsets.UTF_8);
        return HttpUtils.post(url, null, httpEntity, proxyHost, proxyPort, 5000);
    }

    /**
     * doPost的重载方法，json为Object类型
     */
    public static String doPost(String url, Map<String, Object> formData, Object json, String proxyHost, int proxyPort) {
        return doPost(url, formData, json == null ? "" : Japter.fromObject(json), proxyHost, proxyPort);
    }

    /**
     * 发送http get请求
     *
     * @param url       url地址
     * @param map       请求参数
     * @param proxyHost 代理服务器ip
     * @param proxyPort 代理服务器端口
     */
    public static String doGet(String url, Map<String, Object> map, String proxyHost, int proxyPort) {

        url = joinUrl(url, map);
        return HttpUtils.get(url, null, proxyHost, proxyPort, 5000);
    }

    /**
     * 发送http get请求
     *
     * @param url       url地址
     * @param map       请求参数
     * @param proxyHost 代理服务器ip
     * @param proxyPort 代理服务器端口
     */
    public static String doGet(String url, Map<String, Object> map, Header[] headers, String proxyHost, int proxyPort) {
        url = joinUrl(url, map);
        return HttpUtils.get(url, headers, proxyHost, proxyPort, 5000);
    }

    /**
     * 拼接url后的参数
     *
     * @param url url地址
     * @param map 请求参数map
     */
    private static String joinUrl(String url, Map<String, Object> map) {
        if (null != map) {
            StringBuilder param = new StringBuilder();
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                if (i == 0) {
                    param.append("?");
                } else {
                    param.append("&");
                }
                param.append(entry.getKey()).append("=").append(entry.getValue());
                i++;
            }
            url += param;
        }
        return url;
    }
}
