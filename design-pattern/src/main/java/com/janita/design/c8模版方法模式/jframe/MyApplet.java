package com.janita.design.c8模版方法模式.jframe;

import java.applet.Applet;
import java.awt.*;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 16:14
 */
public class MyApplet extends Applet {

    String message;

    @Override
    public void init() {
        message = "Hello World, I am alive";
        repaint();
    }

    @Override
    public void start() {
        message = "Now I am starting up";
        repaint();
    }

    @Override
    public void stop() {
        message = "Now I am stop";
        repaint();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }

    public static void main(String[] args) {
        MyApplet applet = new MyApplet();
    }
}
