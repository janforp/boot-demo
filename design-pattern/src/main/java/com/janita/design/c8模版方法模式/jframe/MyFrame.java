package com.janita.design.c8模版方法模式.jframe;

import javax.swing.*;
import java.awt.*;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-25 - 16:09
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "I rule!!";
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Head First");
    }
}
