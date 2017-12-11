package com.lean.c02_01;

/*
 * <applet code=THello width=300 height=150>
 * </applet>
 */

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class THello extends JApplet {

    public static void main(String[] args) {
        THello helloApplet = new THello();
        helloApplet.init();

        JFrame f = new JFrame("THello");
        f.getContentPane().add(helloApplet);
        f.addWindowListener(new WindowEventHandler());
        f.setSize(300, 150);
        f.setVisible(true);
    }

    @Override
    public void init() {
        getContentPane().add(new JLabel("Hello Swing World", JLabel.CENTER));
    }

    static class WindowEventHandler extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
