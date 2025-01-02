package com.rshairy.designs.FlyweightPattern.RoboExample;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    private static Map<String, IRobot> roboCache = new HashMap<>();

    public static IRobot createRobot(String type) {
        if (roboCache.containsKey(type)) {
            return roboCache.get(type);
        } else {
            // if cache do not contain the objects create new Robotic Objects
            if (type.equals("HUMANOID")) {
                Sprites sprites = new Sprites();
                IRobot humanoid = new HumanoidRobot(type, sprites);
                roboCache.put(type, humanoid);
                return humanoid;
            } else if (type.equals("ROBOTICDOG")) {
                Sprites sprites = new Sprites();
                IRobot roboticDog = new RoboticDog(type, sprites);
                roboCache.put(type, roboticDog);
                return roboticDog;
            }
        }
        return null;
    }
}
