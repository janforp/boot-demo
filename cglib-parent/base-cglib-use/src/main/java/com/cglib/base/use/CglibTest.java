package com.cglib.base.use;

import com.cglib.base.use.proxy.DaoAnotherProxy;
import com.cglib.base.use.proxy.DaoProxy;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-31 - 15:27
 */
public class CglibTest {

    /**
     * <p>
     * 这是使用Cglib的通用写法，setSuperclass表示设置要代理的类，setCallback表示设置回调即MethodInterceptor的实现类，使用create()方法生成一个代理对象，注意要强转一下，因为返回的是Object
     * </p>
     */
    public static void main(String... args) {
        DaoProxy daoProxy = new DaoProxy();
        DaoAnotherProxy daoAnotherProxy = new DaoAnotherProxy();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dao.class);
        enhancer.setCallbacks(new Callback[]{daoProxy, daoAnotherProxy, NoOp.INSTANCE});
        enhancer.setCallbackFilter(new DaoFilter());

        enhancer.setInterceptDuringConstruction(false);

        Dao dao = (Dao)enhancer.create();
        dao.update();
        dao.select();
    }

}