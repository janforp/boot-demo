package com.boot.demo.deep.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

/**
 * 类说明：
 * 由于自定义的Conditional的match方法返回值是false，因此不能注册@Bean配置的对象
 *
 * @author janita
 * @since 2018/11/1 - 下午6:06
 */
@Configuration
public class ServerAutoConfiguration {

    @Configuration
    @Conditional(MyTestConditional.class)
    @Description(value = "student")
    public static class StudentAutoConfiguration {
        @Bean
        public Student student() {
            System.out.println("student create....");
            return new Student();
        }


    }

    @Configuration
    @Conditional(MyTestConditional.class)
    @Description(value = "teacher")
    public static class TeacherAutoConfiguration {
        @Bean
        public Teacher teacher() {
            System.out.println("teacher create.....");
            return new Teacher();
        }
    }
}
