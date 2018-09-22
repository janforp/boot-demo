package com.boot.demo.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类说明：
 * 监控端点
 * 1.http://localhost:9115/manage/health
 * @see com.boot.demo.actuator.actuator.CustomPluginHealthIndicator 支持自定义检查
 * @see org.springframework.boot.actuate.health.DataSourceHealthIndicator  etc
 * 2.http://localhost:9115/manage/autoconfig 自动化配置报告
 * 3.http://localhost:9115/manage/beans 上下文中创建的所有的bean
 * 4.http://localhost:9115/manage/configprops  获取应用中配置的属性信息报告
 * 5.http://localhost:9115/manage/env 获取所有可用的环境属性报告，包括环境变量，jvm属性，配置属性，命令行参数等
 * 6.http://localhost:9115/manage/mappings 返回所有springMVC的控制器映射关系报告
 * 7.http://localhost:9115/manage/info 返回一些应用自定义的信息
 * 8.http://localhost:9115/manage/metrics 返回各类重要的度量指标，如：内存信息，线程信息，垃圾回收信息等
 * 9.http://localhost:9115/manage/metrics/mem.free 细粒度的查询
 * 10.http://localhost:9115/manage/dump 暴露程序运行中的线程信息
 * 11.http://localhost:9115/manage/trace 返回基本的Http跟踪信息，默认保留最近100条
 *
 * @author janita
 * @date 2018/9/16 - 下午8:22
 */
@SpringBootApplication
public class BootActuatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootActuatorApplication.class, args);
    }

}
