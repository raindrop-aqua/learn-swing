/*
 * <applet code=TMouseMotion width=400 height=200>
 * </applet>
 */
package com.lean.c03_03;

import javax.swing.*;
import java.awt.*;

public class TMouseMotion extends JApplet {

    public int x, y;
    public int flag;

    @Override
    public void init() {
        CustomListener ct = new CustomListener(this);
        this.addMouseMotionListener(ct);
    }

    @Override
    public void update(Graphics g) {
        g.setColor(this.getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        paint(g);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Drag/Move the Mouse...", 5, 20);
        g.setColor(Color.red);

        if (flag == 1) {
            g.drawString("Don't Move! Drag the Mouse!", 5, 85);
            g.drawString("Cursor Coordinates:" + x + ", " + y, 5, 95);
        } else if (flag == 2) {
            g.drawString("Don't Move! Move the Mouse!", 5, 85);
            g.drawString("Cursor Coordinates:" + x + ", " + y, 5, 95);
        }
    }
}
