package com.rshairy.designs.CommandDesignPattern.follow;

import com.rshairy.designs.CommandDesignPattern.non.AirConditioner;

public class TurnOffACCommand implements ICommand {
    AirConditioner ac;

    public TurnOffACCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }
}
