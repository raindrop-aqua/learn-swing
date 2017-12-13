/*
 * <applet code=TActionEvent width=300 height=200>
 * </applet>
 */
package com.lean.c03_01;

import javax.swing.*;
import java.awt.*;

public class TActionEvent extends JApplet {

    private static final String PATH = Thread.currentThread().getContextClassLoader().getResource("").getPath();

    private Container container;
    private JLabel label;
    private Icon speaker;

    @Override
    public void init() {
        container = getContentPane();

        speaker = new ImageIcon(PATH + "speaker.gif");
        label = new JLabel(speaker);
        container.add(label);

        JButton source = new JButton("Ring the bell!");
        container.add(source, BorderLayout.SOUTH);

        source.addActionListener(new ButtonListener());
    }
}
