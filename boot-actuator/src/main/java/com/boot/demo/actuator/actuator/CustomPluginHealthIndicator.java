package com.boot.demo.actuator.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 类说明：
 *
 * @author janita
 * @date 2018/9/16 - 下午8:59
 */
@Component
public class CustomPluginHealthIndicator implements HealthIndicator {

    /**
     * Return an indication of health.
     *
     * @return the health for
     */
    @Override
    public Health health() {
        int code = checkSth();
        if (code == 1){
            return Health.up().build();
        }else {
            return Health.down().withDetail("Error Code", code).build();
        }
    }

    private int checkSth() {
        //TODO 做一些自定义的检查工作
        return 1;
    }
}
