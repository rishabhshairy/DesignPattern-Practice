package com.rshairy.designs.BridgeDesignPattern.follows.abstractor;

import com.rshairy.designs.BridgeDesignPattern.follows.implementor.BreatheImplementor;

public class Fish extends LivingThings {
    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathe() {
        // breathe through gills
        breatheImplementor.breathe();
    }
}
