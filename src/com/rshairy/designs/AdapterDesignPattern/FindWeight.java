package com.rshairy.designs.AdapterDesignPattern;

import com.rshairy.designs.AdapterDesignPattern.Adaptee.WeightMachine;
import com.rshairy.designs.AdapterDesignPattern.Adaptee.WeightMachineForBaby;
import com.rshairy.designs.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import com.rshairy.designs.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class FindWeight {
    public static void main(String[] args) {
        WeightMachine weightMachine = new WeightMachineForBaby();

        /**
         * Here we can see the weightMachine Object is passed to adapter
         * So Adapter here acts as bridge between WeightMachine and its implementation
         */
        WeightMachineAdapter adapter = new WeightMachineAdapterImpl(weightMachine);

        System.out.println(adapter.getWeightInKgs());
    }
}
