package com.rshairy.designs.BridgeDesignPattern.follows.abstractor;

import com.rshairy.designs.BridgeDesignPattern.follows.implementor.BreatheImplementor;

public class Tree extends LivingThings {
    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathe() {
        // Photosynthesis
        breatheImplementor.breathe();
    }
}
