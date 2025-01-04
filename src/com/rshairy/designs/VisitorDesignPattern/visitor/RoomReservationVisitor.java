package com.rshairy.designs.VisitorDesignPattern.visitor;

import com.rshairy.designs.VisitorDesignPattern.element.DeluxeRoomElement;
import com.rshairy.designs.VisitorDesignPattern.element.DoubleRoomElement;
import com.rshairy.designs.VisitorDesignPattern.element.SingleRoomElement;

public class RoomReservationVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoomElement room) throws Exception {
        if (room.isAvailable){
            System.out.println("Single Room is available");
            return;
        }
        throw new Exception("All single rooms are occupied");

    }

    @Override
    public void visit(DoubleRoomElement room) throws Exception {
        if (room.isAvailable){
            System.out.println("Double Room is available");
            return;
        }
        throw new Exception("All Double rooms are occupied");
    }

    @Override
    public void visit(DeluxeRoomElement room) throws Exception {
        if (room.isAvailable){
            System.out.println("Deluxe Room is available");
            return;
        }
        throw new Exception("All Deluxe rooms are occupied");
    }
}
