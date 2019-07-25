package com.janita.register.interceptor.filter;

import com.janita.register.interceptor.interceptor.RegisteredInterceptor;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.handler.MappedInterceptor;

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
public class RegisterInterceptorFilter extends OncePerRequestFilter {

    @Override
    protected void initFilterBean() throws ServletException {
        System.out.println("RegisterInterceptorFilter - initFilterBean");
        WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        AutowireCapableBeanFactory factory = context.getAutowireCapableBeanFactory();
        System.out.println(factory);
        if (factory != null) {
            RegisteredInterceptor interceptor;
            if (factory.containsBean(RegisteredInterceptor.class.getName())) {
                //org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.janita.register.interceptor.interceptor.RegisteredInterceptor' available
                //如果不提供空的 afterPropertiesSet 实现，在启动的时候会报错，报错内容如上，为什么？
                interceptor = factory.getBean(RegisteredInterceptor.class);
            } else {
                interceptor = factory.createBean(RegisteredInterceptor.class);
            }
            MappedInterceptor mappedInterceptor = new MappedInterceptor(null, interceptor);
            ((DefaultListableBeanFactory) factory).registerSingleton(RegisteredInterceptor.class.getName(), mappedInterceptor);
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
