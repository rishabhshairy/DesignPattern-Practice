package com.rshairy.designs.StrategyPattern.with;

import com.rshairy.designs.StrategyPattern.with.strategy.DriveStrategy;
import com.rshairy.designs.StrategyPattern.with.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
