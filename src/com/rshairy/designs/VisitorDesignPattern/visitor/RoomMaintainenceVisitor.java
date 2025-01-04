package com.rshairy.designs.VisitorDesignPattern.visitor;

import com.rshairy.designs.VisitorDesignPattern.element.DeluxeRoomElement;
import com.rshairy.designs.VisitorDesignPattern.element.DoubleRoomElement;
import com.rshairy.designs.VisitorDesignPattern.element.SingleRoomElement;

public class RoomMaintainenceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoomElement room) {
        System.out.println("Maintenance is going on for Single Room");
    }

    @Override
    public void visit(DoubleRoomElement room) {
        System.out.println("Maintenance is completed for Double Room");

    }

    @Override
    public void visit(DeluxeRoomElement room) {
        System.out.println("Maintenance is scheduled for Single Room");

    }
}
