package com.rshairy.designs.BridgeDesignPattern.follows.abstractor;

import com.rshairy.designs.BridgeDesignPattern.follows.implementor.BreatheImplementor;

public class Dog extends LivingThings {
    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathe() {
        // Breathe through nose and exhale through mouth
        breatheImplementor.breathe();
    }
}
