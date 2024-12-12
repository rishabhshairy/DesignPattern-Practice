package com.rshairy.solid.dependencyInversion.follow;

import com.rshairy.solid.dependencyInversion.Keyboard;
import com.rshairy.solid.dependencyInversion.Mouse;

/**
 * Now this class follow Dependency Inversion Principle
 * We are using Keyboard and Mouse interfaces rather than concrete classes
 */
public class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
