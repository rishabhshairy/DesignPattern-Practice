package com.rshairy.designs.BridgeDesignPattern.follows.implementor;

public class WaterAnimalBreatheImpl implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Inhale through Gills");
    }
}
