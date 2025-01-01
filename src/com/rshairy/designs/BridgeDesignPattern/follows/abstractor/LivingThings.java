package com.rshairy.designs.BridgeDesignPattern.follows.abstractor;

import com.rshairy.designs.BridgeDesignPattern.follows.implementor.BreatheImplementor;

public abstract class LivingThings {
    BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    public abstract void breathe();
}
