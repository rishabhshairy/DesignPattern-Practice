package com.rshairy.designs.BridgeDesignPattern.follows;

import com.rshairy.designs.BridgeDesignPattern.follows.abstractor.Dog;
import com.rshairy.designs.BridgeDesignPattern.follows.abstractor.LivingThings;
import com.rshairy.designs.BridgeDesignPattern.follows.implementor.LandAnimalBreatheImpl;

public class Client {
    public static void main(String[] args) {
        LivingThings obj = new Dog(new LandAnimalBreatheImpl());
        obj.breathe();
    }
}
