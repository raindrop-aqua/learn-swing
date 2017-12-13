/*
 * <applet code=TKeyEvent width=350 height=100>
 * </applet>
 */
package com.lean.c03_04;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TKeyEvent extends JApplet {

    private Container container;
    private JLabel label;
    private TextField textField;

    @Override
    public void init() {
        container = this.getContentPane();

        textField = new TextField(25);
        textField.addKeyListener(new MyKeyListener());

        Button button = new Button("Clear");
        button.addActionListener(new MyButtonListener());

        label = new JLabel("Key Typed: Null");
        label.setBorder(BorderFactory.createTitledBorder("You Pressed the Following Key"));

        container.setLayout(new BorderLayout());
        container.add("North", textField);
        container.add(label);
        container.add("South", button);

        textField.requestFocus();
    }

    private class MyKeyListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            label.setText("Key Typed: " + c);
        }
    }

    private class MyButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(null);
            textField.requestFocus();
        }
    }
}
