package com.boot.demo.listenerfilter.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 类说明：
 *
 * @author janita
 * @date 2018/9/16 - 下午6:59
 */
@WebFilter(urlPatterns = "/*", filterName = "secondFilter")
public class SecondFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("\n****************** " + "过滤器2初始化...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println("\n****************** " + "过滤器2运行中...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("\n****************** " + "过滤器2销毁...");

    }
}
