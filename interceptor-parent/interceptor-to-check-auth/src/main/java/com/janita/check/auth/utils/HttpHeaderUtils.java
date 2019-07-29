package com.janita.check.auth.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * JAVA原生(URLConnection) Http Https封装 工具类
 *
 * @author youxj
 */
@Slf4j
public class HttpHeaderUtils {

    public static final String HEADER_PARAM_COMPANY_ID = "companyId";

    public static final String HEADER_PARAM_OPERATOR_ID = "operatorId";

    public static final String HEADER_PARAM_OPEN_SESAME = "openSesame";

    public static final String REQUEST_PARAM_ACCESS_TOKEN = "accessToken";

    public static final String REQUEST_PARAM_CHANNEL_DM = "channelDm";

    private static final String REQUEST_PARAM_EMPLOYEE_ID = "employeeId";

    private static final String REQUEST_PARAM_WEB_USER_ID = "webUserId";

    public static final String HEADER_PARAM_WEB_TOKEN = "webToken";

    public static final String HEADER_PARAM_LOGIN_GROUP_CODE = "loginGroupCode";

    public static final String USER_ROLE = "userRole";

    /**
     * 日志
     */
    private static final Logger LOG = LoggerFactory.getLogger(HttpHeaderUtils.class);

    private HttpHeaderUtils() {

    }

    public static HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    public static String getRequestHeader(String name) {
        HttpServletRequest request = getRequest();
        if (null == request) {
            return null;
        }
        return request.getHeader(name);
    }

    public static boolean isOpenSesame(String auth) {
        return HEADER_PARAM_OPEN_SESAME.equals(auth);
    }

    public static boolean isOpenSesame() {
        String token = getRequestHeader(HEADER_PARAM_OPEN_SESAME);
        return isOpenSesame(token);
    }

    public static Long getCompanyId() {
        try {
            String companyIdStr = getRequestHeader(HEADER_PARAM_COMPANY_ID);
            if (StringUtils.isEmpty(companyIdStr)) {
                companyIdStr = getRequest().getParameter(HEADER_PARAM_COMPANY_ID);
            }
            if (StringUtils.isEmpty(companyIdStr)) {
                LOG.debug("header中企业Id获取失败，取默认值0");
                return 0L;
            }
            return Long.valueOf(companyIdStr);
        } catch (Exception e) {
            LOG.debug("header中企业Id获取失败，取默认值0", e);
            return 0L;
        }
    }

    public static String getOperatorId() {
        try {
            String operatorId = getRequestHeader(HEADER_PARAM_OPERATOR_ID);
            if (StringUtils.isEmpty(operatorId)) {
                operatorId = getRequest().getParameter(HEADER_PARAM_OPERATOR_ID);
            }
            if (StringUtils.isEmpty(operatorId)) {
                LOG.debug("header中账户Id获取失败，取默认值空");
                return "";
            }
            return operatorId;
        } catch (Exception e) {
            LOG.debug("header中账户Id获取失败，取默认值空", e);
            return "";
        }
    }

    public static WebTokenParam getWebTokenParam() {
        HttpServletRequest request = getRequest();
        String contentType = request.getContentType();
        WebTokenParam webTokenParam = new WebTokenParam();
        webTokenParam.setWebToken(getRequestHeader(HEADER_PARAM_WEB_TOKEN));
        try {
            if (MediaType.APPLICATION_JSON_VALUE.equals(contentType) || MediaType.APPLICATION_JSON_UTF8_VALUE.equals(contentType)) {
                String paramStr = parseHttpRequestToStr(request);
                Map<String, Object> paramMap = Japter.toObject(paramStr, Map.class);
                String webUserId = String.valueOf(paramMap.get(REQUEST_PARAM_WEB_USER_ID));
                String employeeId = String.valueOf(paramMap.get(REQUEST_PARAM_EMPLOYEE_ID));
                String companyId = String.valueOf(paramMap.get(HEADER_PARAM_COMPANY_ID));
            } else if (MediaType.APPLICATION_FORM_URLENCODED_VALUE.equals(contentType)) {
                String webUserId = request.getParameter(REQUEST_PARAM_WEB_USER_ID);
                String employeeId = request.getParameter(REQUEST_PARAM_EMPLOYEE_ID);
                String companyId = request.getParameter(HEADER_PARAM_COMPANY_ID);
            }
        } catch (Exception e) {
            log.warn("转换Id失败", e);
        }
        return webTokenParam;
    }

    /**
     * 下载导出excel的时候设置http header
     *
     * @param fileName 导出文件名
     */
    public static void setExcelResponseHeader(String fileName, HttpServletResponse httpServletResponse) {

        setDownloadResponseHeader(fileName, "application/vnd.ms-excel", httpServletResponse);
    }

    /**
     * 下载导出zip的时候设置http header
     *
     * @param fileName 导出文件名
     */
    public static void setZipResponseHeader(String fileName, HttpServletResponse httpServletResponse) {

        setDownloadResponseHeader(fileName, "APPLICATION/OCTET-STREAM", httpServletResponse);
    }

    /**
     * 下载导出word的时候设置http header
     *
     * @param fileName 导出文件名
     */
    public static void setWordResponseHeader(String fileName, HttpServletResponse httpServletResponse) {

        setDownloadResponseHeader(fileName, "application/msword", httpServletResponse);
    }

    private static void setDownloadResponseHeader(String fileName, String contentType, HttpServletResponse httpServletResponse) {
        fileName = new String(fileName.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
        String headStr = "attachment; filename=\"" + fileName + "\"";
        httpServletResponse.setContentType(contentType);
        httpServletResponse.setHeader("Content-Disposition", headStr);
    }

    /**
     * 设置http返回对象返回错误码
     */
    public static void setErrorResponseStatus(HttpServletResponse httpServletResponse) {
        httpServletResponse.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }

    /**
     * 获取地区码
     */
    public static String getLocationCode() {
        return getRequest().getParameter("locationCode");
    }

    /**
     * 将request请求转换成字符串
     *
     * @param request http请求
     * @return 获取到的body中的内容
     */
    public static String parseHttpRequestToStr(HttpServletRequest request) {
        int len = request.getContentLength();
        if (len <= 0) {
            log.error("request请求头为空");
            return null;
        }
        try {
            InputStream inputStream = request.getInputStream();
            byte[] bytes = new byte[len];
            len = inputStream.read(bytes);
            return new String(bytes, 0, len, StandardCharsets.UTF_8);
        } catch (Exception ex) {
            log.error("转换成字符串出错:", ex);
            return null;
        }
    }
}

