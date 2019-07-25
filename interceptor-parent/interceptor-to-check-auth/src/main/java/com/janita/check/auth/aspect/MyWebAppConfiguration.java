package com.janita.check.auth.aspect;

import com.janita.check.auth.service.CheckAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Janita on 2017-03-21 19:57
 *
 * @author Janita
 */
@Configuration
public class MyWebAppConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    private CheckAuthService webTokenService;

    /**
     * 多个拦截器组成一个拦截器链 addPathPatterns 用于添加拦截规则 excludePathPatterns 用户排除拦截
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CheckAuthInterceptor(webTokenService)).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
