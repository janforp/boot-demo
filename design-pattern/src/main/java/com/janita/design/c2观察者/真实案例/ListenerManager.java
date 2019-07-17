package com.janita.design.c2观察者.真实案例;

import java.util.ArrayList;
import java.util.List;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-17 - 16:44
 */
public class ListenerManager {

    public static volatile ListenerManager instance;

    private List<OnUserLoginListener> list = new ArrayList<>();

    private ListenerManager() {
    }

    public static ListenerManager getInstance() {
        if (instance == null) {
            synchronized (ListenerManager.class) {
                if (instance == null) {
                    instance = new ListenerManager();
                }
            }
        }
        return instance;
    }

    /**
     * 添加监听
     */
    public void addListener(OnUserLoginListener listener) {
        list.add(listener);
    }

    /**
     * 移除监听
     */
    public void removeListener(OnUserLoginListener listener) {
        list.remove(listener);
    }

    /**
     * 获取所有的监听
     */
    public List<OnUserLoginListener> getAllListeners() {
        return list;
    }
}
