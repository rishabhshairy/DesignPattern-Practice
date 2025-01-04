package com.rshairy.designs.VisitorDesignPattern.element;

import com.rshairy.designs.VisitorDesignPattern.visitor.RoomVisitor;

public class DeluxeRoomElement implements RoomElement {

    public int price = 0;
    public boolean isAvailable = false;

    @Override
    public void accept(RoomVisitor visitor) throws Exception {
        visitor.visit(this);
    }
}
