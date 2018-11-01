package com.boot.demo.deep.conditional;

import com.boot.demo.deep.entity.Sky;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 类说明：
 * @ConditionalOnProperty 为常用的注解，实现原理见下
 *
 * @author janita
 * @since 2018/11/1 - 下午7:47
 * @see org.springframework.boot.autoconfigure.condition.OnPropertyCondition#getMatchOutcome(ConditionContext, AnnotatedTypeMetadata)
 */
@Configuration
@ConditionalOnProperty(prefix = "prop" , value = {"enable"})
public class ConditionalOnPropertyAutoConfiguration {

    @Bean
    public Sky sky() {
        return new Sky();
    }
}
