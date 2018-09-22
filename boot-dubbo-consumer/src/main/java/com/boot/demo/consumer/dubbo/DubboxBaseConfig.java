package com.boot.demo.consumer.dubbo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * @since  2017-05-27 09:08
 * @author Janita
 * 该模块的 dubbo 服务提供配置
 */
public class DubboxBaseConfig {

	@Value("${zk.host.port}")
	private String zkHostPort;

	@Value("${zk.protocol}")
	private String zkProtocol;

	@Value("${dubbo.port}")
	private String dubboPort;

	@Value("${dubbo.admin.username}")
	private String username;

	@Value("${dubbo.admin.password}")
	private String password;

	@Value("${dubbo.application.name}")
	private String applicationName;

	@Value("${dubbo.service.timeout}")
	public String serviceTimeout;

	@Value("${dubbo.service.retry.times}")
	public String retryTimes;

	@Bean
	public RegistryConfig registry(){
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress(zkHostPort);
		registryConfig.setProtocol(zkProtocol);
		registryConfig.setUsername(username);
		registryConfig.setPassword(password);
		return registryConfig;
	}

	@Bean
	public ApplicationConfig application(){
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName(applicationName);
		return applicationConfig;
	}

	@Bean
	public ProtocolConfig protocolConfig(){
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setPort(Integer.valueOf(dubboPort));
		return protocolConfig;
	}
}