package com.boot.demo.consumer.dubbo;

import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.boot.demo.dubbo.api.service.IUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @since  2017-05-27 09:08
 * @author Janita
 * 该模块的 dubbo 服务提供配置
 */
@Configuration
public class ServiceImportConfig extends DubboxBaseConfig {

    /**
     * 引用服務
     * @return  服务的对象
     */
    @Bean(name="connectWithHisService")
    public ReferenceBean<IUserService> userServiceReferenceBean(){
        ReferenceBean<IUserService> ref = new ReferenceBean<IUserService>();
        ref.setVersion("v1");
        ref.setInterface(IUserService.class);
        ref.setTimeout(Integer.valueOf(serviceTimeout));
        ref.setRetries(Integer.valueOf(retryTimes));
        ref.setCheck(false);
        return ref;
    }
}
