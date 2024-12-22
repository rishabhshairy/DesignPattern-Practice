package com.rshairy.designs.NULLDesignPattern;

/**
 * This class will be returned if no valid implementation of Vehicle is found
 */
public class NULLVehicle implements Vehicle{

    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
}
