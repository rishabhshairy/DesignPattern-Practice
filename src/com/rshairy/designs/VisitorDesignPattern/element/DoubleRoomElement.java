package com.rshairy.designs.VisitorDesignPattern.element;

import com.rshairy.designs.VisitorDesignPattern.visitor.RoomVisitor;

public class DoubleRoomElement implements RoomElement {
    public int price = 0;
    public boolean isAvailable = true;

    @Override
    public void accept(RoomVisitor visitor) throws Exception {
        visitor.visit(this);
    }
}
