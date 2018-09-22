package com.boot.demo.druidmonitor.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * 类说明：
 *
 * @author janita
 * @date 2018/9/16 - 下午9:23
 */
@WebFilter(filterName="druidStatFilter",urlPatterns="/*",
        initParams={@WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*") /**忽略资源*/})
public class DruidStatFilter extends WebStatFilter {
}
