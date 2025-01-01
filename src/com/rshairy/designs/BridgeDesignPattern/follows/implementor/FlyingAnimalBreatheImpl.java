package com.rshairy.designs.BridgeDesignPattern.follows.implementor;

public class FlyingAnimalBreatheImpl implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Inhale through Narse");
    }
}
