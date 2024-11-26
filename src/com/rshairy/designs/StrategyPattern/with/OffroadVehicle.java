package com.rshairy.designs.StrategyPattern.with;

import com.rshairy.designs.StrategyPattern.with.strategy.DriveStrategy;
import com.rshairy.designs.StrategyPattern.with.strategy.SpecialDriveStrategy;

public class OffroadVehicle extends Vehicle{

    // here we are instantiating the Object of Special Drive strategy
    public OffroadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
