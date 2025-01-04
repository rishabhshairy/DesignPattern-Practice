package com.rshairy.designs.CommandDesignPattern.non;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOnAc();
        airConditioner.setTemperature(24);
        airConditioner.turnOffAC();
    }
}
