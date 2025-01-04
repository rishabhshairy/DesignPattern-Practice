package com.rshairy.designs.CommandDesignPattern.follow;

import com.rshairy.designs.CommandDesignPattern.non.AirConditioner;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        Invoker invoker = new Invoker(new TurnOnACCommand(airConditioner));
        invoker.invokeCommand();

        Invoker invoker1 = new Invoker(new TurnOffACCommand(airConditioner));
        invoker1.invokeCommand();
    }
}
