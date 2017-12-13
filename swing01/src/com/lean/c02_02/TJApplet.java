/*
 * <applet code=TJApplet width=200 height=150>
 * </applet>
 */
package com.lean.c02_02;

import javax.swing.*;
import java.awt.*;

public class TJApplet extends JApplet {

    private static final String PATH = Thread.currentThread().getContextClassLoader().getResource("").getPath();

    @Override
    public void init() {
        System.out.println(PATH);
        Container contentPane = getContentPane();
        JLabel label = new JLabel("This is a swing applet.", new ImageIcon(PATH + "Metal.gif"), JLabel.CENTER);
        label.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new ImageIcon(PATH + "border.gif")));
        contentPane.add(label);
    }
}
