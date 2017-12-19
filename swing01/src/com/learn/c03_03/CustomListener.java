package com.learn.c03_03;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class CustomListener implements MouseMotionListener {

    private TMouseMotion tm;

    public CustomListener(TMouseMotion tm) {
        this.tm = tm;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        tm.flag = 1;
        tm.x = e.getX();
        tm.y = e.getY();
        tm.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        tm.flag = 2;
        tm.x = e.getX();
        tm.y = e.getY();
        tm.repaint();
    }
}
