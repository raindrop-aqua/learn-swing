package com.lean.c04_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TJLayeredPane extends JFrame implements ActionListener {

    static final int xOffset = 25;
    static final int yOffset = 25;
    static int frameCount = 0;
    JButton button;
    JLayeredPane layeredPane;
    Integer[] layerConstants = new Integer[]{
            JLayeredPane.DEFAULT_LAYER,
            JLayeredPane.PALETTE_LAYER,
            JLayeredPane.MODAL_LAYER,
            JLayeredPane.POPUP_LAYER,
            JLayeredPane.DRAG_LAYER
    };

    String[] layerNames = new String[]{
            "Default Layer",
            "Palette Layer",
            "Modal Layer",
            "Popup Layer",
            "Drag Layer"
    };

    public TJLayeredPane() {
        super("TJLayeredPane");

        JPanel panel = new JPanel(new GridLayout(3, 3));
        panel.setBorder(BorderFactory.createTitledBorder("Click the Specific Button to Add Frames or Clear Frames"));

        for (int i = 0; i < layerNames.length; i++) {
            if (i < layerNames.length) {

            } else {
            }
        }



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
