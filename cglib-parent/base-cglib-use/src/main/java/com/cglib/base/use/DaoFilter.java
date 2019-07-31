package com.cglib.base.use;

import org.springframework.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-31 - 16:02
 */
public class DaoFilter implements CallbackFilter {

    @Override
    public int accept(Method method) {
        if ("select".equals(method.getName())) {
            return 0;
        }
        return 1;
    }
}