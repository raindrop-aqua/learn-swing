package com.learn.c04_03;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyVetoException;

public class TJInternalFrame extends JFrame {

    private static final int X_OFFSET = 25;
    private static final int Y_OFFSET = 25;
    private static int frameCount = 1;
    private JDesktopPane desktop;

    public TJInternalFrame() throws HeadlessException {
        super("TJInternalFrame");
        Container container = this.getContentPane();

        JButton button = new JButton("Click to Create More Internal Frames");
        button.addActionListener(new ButtonListener());
        container.add(button, BorderLayout.SOUTH);

        desktop = new JDesktopPane();
        container.add(desktop);
        createInternalFrame();

        addWindowListener(new MyWindowEventHandler());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    private void createInternalFrame() {
        JInternalFrame iFrame = new JInternalFrame("Internal Frame - " + (frameCount++),
                true, true, true, true);
        iFrame.setLocation(X_OFFSET * (frameCount - 2),
                Y_OFFSET * (frameCount - 2));
        iFrame.setSize(200, 150);
        iFrame.setVisible(true);
        desktop.add(iFrame);

        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException e) {
            System.out.println("Exception while selecting an internal frame");
        }
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            createInternalFrame();
        }
    }

    private class MyWindowEventHandler extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new TJInternalFrame();
    }
}
