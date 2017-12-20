/*
 * <applet code=TJPanel width=400 height=200>
 * </applet>
 */
package com.learn.c04_04;

import javax.swing.*;
import java.awt.*;

public class TJPanel extends JApplet {

    @Override
    public void init() {
        Container container = getContentPane();
        container.setLayout(new GridLayout(2, 1, 2, 2));

        JPanel p1 = new JPanel(new GridLayout(1,3, 2, 2));
        JPanel p2 = new JPanel(new GridLayout(1,2, 2, 2));
        JPanel p3 = new JPanel(new GridLayout(2,1, 2, 2));
        JPanel p4 = new JPanel(new GridLayout(1,2, 2, 2));

        setLabel(p1, "[P1]Label1");
        setLabel(p1, "[P1]Label2");
        setLabel(p1, "[P1]Label3");

        setLabel(p2, "[P2]Label1");
        setLabel(p2, "[P2]Label2");

        setLabel(p3, "[P3]Label1");
        setLabel(p3, "[P3]Label2");

        p4.add(p2);
        p4.add(p3);

        container.add(p1);
        container.add(p4);
    }

    private void setLabel(Container panel, String text) {
        JLabel label = new JLabel(text, JLabel.CENTER);
        label.setOpaque(true);
        label.setForeground(Color.white);
        label.setBackground(Color.gray);
        panel.add(label);
    }
}
