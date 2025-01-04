package com.rshairy.designs.CommandDesignPattern.follow;

import com.rshairy.designs.CommandDesignPattern.non.AirConditioner;

public class TurnOnACCommand implements ICommand {
    AirConditioner airConditioner;

    public TurnOnACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOnAc();
    }
}
