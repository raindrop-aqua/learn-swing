package com.learn.c04_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TJFrame extends JFrame {

    Container container = null;

    public TJFrame(String title) {
        super(title);

        container = getContentPane();
        container.setBackground(Color.white);
        container.setForeground(Color.blue);

        JLabel label = new JLabel("This is Swing frame", JLabel.CENTER);
        label.setFont(new Font("Sans", Font.PLAIN, 22));
        container.add(label);

        addWindowListener(new WindowEventHandler());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(350, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        TJFrame frame = new TJFrame("Swing Frame");
    }

    private class WindowEventHandler extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
