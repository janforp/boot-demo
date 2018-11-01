package com.boot.demo.deep.word;

import com.boot.demo.deep.conditional.MyTestConditional;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 类说明：
 * 关于@Conditional
 *
 * @author janita
 * @since 2018/11/1 - 下午8:50
 */
public class OneConditional {

    /**
     *
     *
     * 我们知道自动装配是SpringBoot微服务化的核心，
     * 它会把META-INF/spring.factoires里配置的EnableAutoConfiguration注册到IOC容器里。
     * 但是，请大家考虑一个问题，根据需求我们要配置一个tomcat的内嵌容器，
     * 可是当前的运行环境里都没有servlet的相关API或者说当前的ApplicationContext不是一个WebApplicationContext，
     * 如果这样的话，那么创建tomcat的内嵌容器还有什么意义上呢？如果根据需求我们想自动装配一个Mybatis的SqlSessionFactory，
     * 可是运行环境里连DataSource都没有，恐怕要自动装配Mybatis的愿望也会落空吧！针对这种问题，SpringBoot早都考虑到了，
     * 下面我们来看看SpringBoot是怎么解决的。
     *
     *
     * 一、关于@Conditional
     * conditional中文的意思为条件，其本身是Springframework提供的核心注解，
     * 通常情况下该注解可以加在类上或者方法上与@Configuration或者@Bean配合使用，
     * 当和@Configuration配合使用时，那么该类下所有@Bean方法 或者@Import
     * 或者 @ComponentScan都会受到其配置条件的影响，我们先看一下其源码
     *
     * @see org.springframework.context.annotation.Conditional
     * @see org.springframework.context.annotation.Condition
     *
     * Condition接口有一个方法
     * @see org.springframework.context.annotation.Condition#matches(ConditionContext, AnnotatedTypeMetadata)
     *
     * 看一下例子
     * 自定义的
     * @see MyTestConditional
     * @see com.boot.demo.deep.conditional.CustomConditionalAutoConfiguration
     *
     *
     *
     *
     */


    /**
     * 二、SpringBoot中对Conditional的扩展
     * 在SpringBoot中定义了一个SpringBootCondition类对Condition进行了扩展，该类源代码如下：
     * @see org.springframework.boot.autoconfigure.condition.SpringBootCondition
     * 各种不同的实现用不同的方式去实现方法
     * @see org.springframework.boot.autoconfigure.condition.SpringBootCondition#getMatchOutcome(ConditionContext, AnnotatedTypeMetadata)
     * 来达到不同的条件
     * return outcome.isMatch();
     * @see ConditionOutcome#match
     *
     * 重写getMatchOutcome方法来进行，匹配结果的过滤
     *
     * springBoot的常用的实现
     * 关于 Class Conditions
     * 有 ConditionalOnClass，ConditionalOnMissingClass
     * @see org.springframework.boot.autoconfigure.condition.ConditionalOnClass
     * @see org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass
     * 他们的匹配函数见
     * @see OnClassCondition
     *
     * 例子
     * @see com.boot.demo.deep.conditional.ConditionOnBeanServerAutoConfiguration
     */
}
