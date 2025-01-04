package com.rshairy.designs.VisitorDesignPattern.visitor;

import com.rshairy.designs.VisitorDesignPattern.element.DeluxeRoomElement;
import com.rshairy.designs.VisitorDesignPattern.element.DoubleRoomElement;
import com.rshairy.designs.VisitorDesignPattern.element.SingleRoomElement;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoomElement room) {
        room.price = 1000;
        System.out.println("Price for single room is " + room.price);
    }

    @Override
    public void visit(DoubleRoomElement room) {
        room.price = 2000;
        System.out.println("Price for Double room is " + room.price);
    }

    @Override
    public void visit(DeluxeRoomElement room) {
        room.price = 5000;
        System.out.println("Price for Deluxe room is " + room.price);
    }
}
