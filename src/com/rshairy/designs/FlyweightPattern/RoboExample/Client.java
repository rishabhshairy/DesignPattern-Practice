package com.rshairy.designs.FlyweightPattern.RoboExample;

public class Client {
    public static void main(String[] args) {

        IRobot humanoid = RoboticFactory.createRobot("HUMANOID");
        humanoid.display(1, 2);

        IRobot humanoid2 = RoboticFactory.createRobot("HUMANOID");
        humanoid.display(1, 2);
    }
}
