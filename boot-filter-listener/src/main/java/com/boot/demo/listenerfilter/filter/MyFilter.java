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
 * @author janita
 * @since 2018/9/9 - 上午10:36
 * 类说明：
 */
@WebFilter(urlPatterns = "/*", filterName = "filter")
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("\n****************** " + "过滤器初始化...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        System.out.println("\n****************** " + "过滤器运行中...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("\n****************** " + "过滤器销毁...");

    }
}
