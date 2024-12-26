package com.rshairy.designs.AdapterDesignPattern.Adapter;

import com.rshairy.designs.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public int getWeightInKgs() {
        return (int) (weightMachine.getWeightInPounds() * 0.45);
    }
}
