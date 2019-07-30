package spring.application.context.aware.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-30 - 13:55
 */
@Service
public class TestServiceImpl implements TestService, ApplicationContextAware {

    private ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public String test(String test) {
        TestService bean = applicationContext.getBean(TestService.class);
        return test + bean.toString();
    }
}
