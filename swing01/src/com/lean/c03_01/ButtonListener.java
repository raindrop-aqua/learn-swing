package com.lean.c03_01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        int i = 0;

        while (i < 10) {
            Toolkit.getDefaultToolkit().beep();

            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            i++;
        }
    }
}
