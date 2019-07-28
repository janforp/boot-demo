package com.boot.demo.prodiver.dubbo;

import com.alibaba.dubbo.config.spring.ServiceBean;
import com.boot.demo.dubbo.api.service.IUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @since  2017-05-27 09:08
 * @author Janita
 * 该模块的 dubbo 服务提供配置
 */
@Configuration
public class BaseServiceExposeConfig extends DubboxBaseConfig {

    /**
     * IBaseClazzSubjectTeacherRecordService 接口暴露
     * @param userService   接口
     * @return  一个服务
     */
    @Bean
    public ServiceBean<IUserService> connectWithHisService(IUserService userService){
        ServiceBean<IUserService> serviceBean = new ServiceBean<IUserService>();
        serviceBean.setProxy("javassist");
        serviceBean.setVersion("v1");
        serviceBean.setInterface(IUserService.class.getName());
        serviceBean.setRef(userService);
        serviceBean.setTimeout(Integer.valueOf(serviceTimeout));
        serviceBean.setRetries(Integer.valueOf(retryTimes));
        return serviceBean;
    }
}
