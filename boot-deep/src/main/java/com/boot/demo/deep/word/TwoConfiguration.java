package com.boot.demo.deep.word;


import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 类说明：
 * 关于@Configuration
 * 基于@Configuration 注册Bean分析
 *
 * https://www.cnblogs.com/niechen/p/9047264.html?utm_source=gold_browser_extension
 *
 * @author janita
 * @since 2018/11/1 - 下午8:50
 */
public class TwoConfiguration {

    /**
     * @see org.springframework.context.annotation.Configuration
     * 解析 Configuration 的类有
     * @see org.springframework.context.annotation.AnnotationConfigApplicationContext
     * 该类下有注册bean的方法：
     * @see org.springframework.context.annotation.AnnotationConfigApplicationContext#register(Class[])
     * 可以注册添加类@Bean方法
     * @see org.springframework.context.annotation.AnnotationConfigApplicationContext#reader
     * 具体的注册方法：
     * @see org.springframework.context.annotation.AnnotatedBeanDefinitionReader#registerBean(Class, String, Class[])
     * 于前面的 Conditional 条件的衔接点：
     * AnnotatedGenericBeanDefinition abd = new AnnotatedGenericBeanDefinition(annotatedClass);
     * 		if (this.conditionEvaluator.shouldSkip(abd.getMetadata())) {
     * 			return;
     * 		}
     * @see org.springframework.context.annotation.ConditionEvaluator#shouldSkip(AnnotatedTypeMetadata)
     * 在这里我们就大概的了解完了springBoot的自动装配的实现原理
     *
     *
     *
     * 总结：SpringBoot通过扩展Conditional来设置装配Bean的条件，通过Condition接口的matches方法的返回值来判断是否向IOC容器里注册Bean
     */
}
