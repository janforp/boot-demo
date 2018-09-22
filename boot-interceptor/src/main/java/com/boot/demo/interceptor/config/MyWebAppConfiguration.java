package com.boot.demo.interceptor.config;

import com.boot.demo.interceptor.interceptor.FirstInterceptor;
import com.boot.demo.interceptor.interceptor.SecondInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Janita on 2017-03-21 19:57
 * @author Janita
 */
@Configuration
public class MyWebAppConfiguration extends WebMvcConfigurerAdapter {

    /**
     * 多个拦截器组成一个拦截器链
     * addPathPatterns 用于添加拦截规则
     * excludePathPatterns 用户排除拦截
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new FirstInterceptor()).addPathPatterns("/interceptor/first/**");
        registry.addInterceptor(new SecondInterceptor()).addPathPatterns("/interceptor/second/**");

        super.addInterceptors(registry);
    }
}
