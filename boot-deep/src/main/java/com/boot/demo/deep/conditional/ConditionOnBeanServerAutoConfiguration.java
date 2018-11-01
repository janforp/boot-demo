package com.boot.demo.deep.conditional;

import com.boot.demo.deep.entity.Cat;
import com.boot.demo.deep.entity.Dog;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/11/1 - 下午6:42
 */
@Configuration
public class ConditionOnBeanServerAutoConfiguration {

    /**
     * ConditionalOnBean：只有当BeanFactory里包含指定的Bean时，才能通过匹配
     */
    @Configuration
    @ConditionalOnBean(Dog.class)
    public static class DogAutoConfiguration {
        @Bean
        public Dog dog() {
            System.out.println("Dog create....");
            return new Dog();
        }
    }

    /**
     * ConditionalOnMissingBean：只有当BeanFactory不包含指定的Bean时，才能通过匹配
     */
    @Configuration
    @ConditionalOnMissingBean(Cat.class)
    public static class CatAutoConfiguration {
        @Bean
        public Cat cat() {
            System.out.println("Cat create.....");
            return new Cat();
        }
    }
}
