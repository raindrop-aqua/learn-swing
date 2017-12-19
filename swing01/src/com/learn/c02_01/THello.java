/*
 * <applet code=THello width=300 height=150>
 * </applet>
 */
package com.learn.c02_01;

import javax.swing.*;

public class THello extends JApplet {

    private static final String PATH = Thread.currentThread().getContextClassLoader().getResource("").getPath();

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
        getContentPane().add(new JLabel("Hello Swing World", new ImageIcon(PATH + "AnimSpeaker.gif"), JLabel.CENTER));
    }
}
