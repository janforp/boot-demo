package com.janita.about.bean.filter;

import com.boot.demo.common.model.User;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 10:37
 */
@WebFilter(urlPatterns = "/*", filterName = "filter")
public class BaseFilter extends OncePerRequestFilter {

    @Override
    protected void initFilterBean() throws ServletException {
        System.out.println("RegisterInterceptorFilter - initFilterBean");
        WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        AutowireCapableBeanFactory factory = context.getAutowireCapableBeanFactory();
        System.out.println(factory);
        if (factory != null) {
            User user = factory.createBean(User.class);
            user.setUserId("100");
            user.setUserName("时候");
            //createBean的bean在factory中是获取不到的，必须要进行注册，才能获取到
            ((DefaultListableBeanFactory) factory).registerSingleton(User.class.getName(), user);
        }
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
        throws ServletException, IOException {
        filterChain.doFilter(request, response);
    }

    @Override
    public void afterPropertiesSet() throws ServletException {
        //empty
    }
}
