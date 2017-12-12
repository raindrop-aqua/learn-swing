package com.lean.c03_02;

/*
 * <applet code=TMouse width=400 height=200>
 * </applet>
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TMouse extends JApplet implements MouseListener {

    private Container container;
    private int width, height;
    private int x, y;
    private int flag;
    private String mouseState;

    @Override
    public void init() {
        container = getContentPane();

        x = 0;
        y = 0;
        width = 2;
        height = 2;
        flag = 0;

        container.addMouseListener(this);
    }

    @Override
    public void update(Graphics g) {
        g.setColor(this.getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        paint(g);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Click the Mouse Button...", 5, 20);
        g.setColor(Color.red);

        if (flag == 1) {
            g.drawString("Mouse Entered Applet!", 5, 80);
        } else if (flag == 2) {
            g.drawString("Mouse Exited Applet!", 5, 80);
        } else if (flag == 3) {
            g.drawString("Mouse Entered Applet!", 5, 80);
            g.fillRect(x, y, width, height);
            g.drawString("Clicked Here!", x, y);
        } else if (flag == 4) {
            g.drawString("Mouse Entered Applet!", 5, 80);
            g.fillRect(x, y, width, height);
            g.drawString("Pressed Here!", x, y);
        } else if (flag == 5) {
            g.drawString("Mouse Entered Applet!", 5, 80);
            g.fillRect(x, y, width, height);
            g.drawString("Mouse Released!", x, y);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        flag = 1;
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        flag = 2;
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        flag = 3;
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        flag = 4;
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        flag = 5;
        x = e.getX();
        y = e.getY();
        repaint();
    }
}
