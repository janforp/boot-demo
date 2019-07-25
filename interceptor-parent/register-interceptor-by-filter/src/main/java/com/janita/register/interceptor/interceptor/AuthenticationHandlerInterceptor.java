package com.janita.register.interceptor.interceptor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 10:38
 */
public class AuthenticationHandlerInterceptor implements HandlerInterceptor, InitializingBean, ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("afterPropertiesSet");

    }

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("afterPropertiesSet");

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
        ModelAndView modelAndView) throws Exception {
        System.out.println("afterPropertiesSet");

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e)
        throws Exception {
        System.out.println("afterPropertiesSet");

    }
}
