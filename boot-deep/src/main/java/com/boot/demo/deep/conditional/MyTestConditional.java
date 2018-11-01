package com.boot.demo.deep.conditional;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/11/1 - 下午5:59
 */
public class MyTestConditional implements ConfigurationCondition {

    /**
     * 1）PARSE_CONFIGURATION：会在解析@Configuration时进行condition的解析
     * 2）REGISTER_BEAN：会在注册Bean的时候进行condition的解析
     *
     * @return
     */
    @Override
    public ConfigurationPhase getConfigurationPhase() {
        return ConfigurationPhase.REGISTER_BEAN;
    }

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> map =
                metadata.getAnnotationAttributes("org.springframework.context.annotation.Description");
        System.out.println(map);
        return true;
    }
}
