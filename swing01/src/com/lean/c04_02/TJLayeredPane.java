package com.lean.c04_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Vector;

public class TJLayeredPane extends JFrame implements ActionListener {

    private static final String PATH = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    private static final int X_OFFSET = 25;
    private static final int Y_OFFSET = 25;
    private static int frameCount = 0;
    private JLayeredPane layeredPane;
    private Integer[] layerConstants = new Integer[]{
            JLayeredPane.DEFAULT_LAYER,
            JLayeredPane.PALETTE_LAYER,
            JLayeredPane.MODAL_LAYER,
            JLayeredPane.POPUP_LAYER,
            JLayeredPane.DRAG_LAYER
    };

    private String[] layerNames = new String[]{
            "Default Layer",
            "Palette Layer",
            "Modal Layer",
            "Popup Layer",
            "Drag Layer"
    };

    private Vector<JInternalFrame> framesVector = new Vector<>();

    private TJLayeredPane() {
        super("TJLayeredPane");

        JPanel panel = new JPanel(new GridLayout(3, 3));
        panel.setBorder(BorderFactory.createTitledBorder("Click the Specific Button to Add Frames or Clear Frames"));

        for (int i = 0; i < layerNames.length + 1; i++) {
            JButton button;
            if (i < layerNames.length) {
                button = new JButton("Add to " + layerNames[i]);
                button.setActionCommand(layerNames[i]);
            } else {
                button = new JButton("Clear the Frame");
                button.setActionCommand("Clear");
                button.setForeground(Color.red);
            }
            button.addActionListener(this);
            panel.add(button);
        }
        getContentPane().add(panel, BorderLayout.SOUTH);

        layeredPane = getLayeredPane();

        addWindowListener(new WindowEventHandler());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton tempButton = (JButton) e.getSource();
        if (layerNames[0].equals(tempButton.getActionCommand())) {
            addInternalFrame(0);
        } else if (layerNames[1].equals(tempButton.getActionCommand())) {
            addInternalFrame(1);
        } else if (layerNames[2].equals(tempButton.getActionCommand())) {
            addInternalFrame(2);
        } else if (layerNames[3].equals(tempButton.getActionCommand())) {
            addInternalFrame(3);
        } else if (layerNames[4].equals(tempButton.getActionCommand())) {
            addInternalFrame(4);
        } else if ("Clear".equals(tempButton.getActionCommand())) {
            for (Enumeration<JInternalFrame> enums = framesVector.elements(); enums.hasMoreElements(); ) {
                enums.nextElement().dispose();
            }
            frameCount = 0;
        }
    }

    private void addInternalFrame(int index) {
        JInternalFrame iFrame = new JInternalFrame(
                "In " + layerNames[index], // 名称
                true, // サイズ変更可
                true, // クローズ可
                true, // 最大化可
                true    // アイコン化可
        );
        framesVector.addElement(iFrame);

        iFrame.setLocation(X_OFFSET * frameCount, Y_OFFSET * frameCount++);
        iFrame.setSize(200, 150);
        iFrame.setDefaultCloseOperation(iFrame.DO_NOTHING_ON_CLOSE);
        iFrame.setFrameIcon(new ImageIcon(PATH + "new.gif"));
        layeredPane.add(iFrame, layerConstants[index]);
        iFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new TJLayeredPane();
    }
}
