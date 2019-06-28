package com.janita.design.c12复合模式.观察者;

import static com.boot.demo.common.util.CommonUtils.print;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-28 - 16:19
 */
public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        print("嘎嘎叫学家：" + duck + "刚刚叫了");
    }
}
