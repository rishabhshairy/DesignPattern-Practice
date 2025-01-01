package com.rshairy.designs.BridgeDesignPattern.follows.implementor;

public class LandAnimalBreatheImpl implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Inhale through Nose/Lungs");
    }
}
