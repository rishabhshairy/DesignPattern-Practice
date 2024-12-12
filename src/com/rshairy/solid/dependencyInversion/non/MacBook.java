package com.rshairy.solid.dependencyInversion.non;

import com.rshairy.solid.dependencyInversion.WiredKeyboard;
import com.rshairy.solid.dependencyInversion.WiredMouse;

public class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBook() {
        keyboard=new WiredKeyboard();
        mouse=new WiredMouse();
    }
}
