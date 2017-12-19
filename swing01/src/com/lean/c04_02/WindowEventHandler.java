package com.lean.c04_02;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEventHandler extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }
}
