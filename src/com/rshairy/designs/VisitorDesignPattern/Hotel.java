package com.rshairy.designs.VisitorDesignPattern;

import com.rshairy.designs.VisitorDesignPattern.element.DeluxeRoomElement;
import com.rshairy.designs.VisitorDesignPattern.element.DoubleRoomElement;
import com.rshairy.designs.VisitorDesignPattern.element.RoomElement;
import com.rshairy.designs.VisitorDesignPattern.element.SingleRoomElement;
import com.rshairy.designs.VisitorDesignPattern.visitor.RoomMaintainenceVisitor;
import com.rshairy.designs.VisitorDesignPattern.visitor.RoomPricingVisitor;
import com.rshairy.designs.VisitorDesignPattern.visitor.RoomReservationVisitor;

public class Hotel {
    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoomElement();
        RoomElement doubleRoom = new DoubleRoomElement();
        RoomElement deluxeRoom = new DeluxeRoomElement();
        try {
            singleRoom.accept(new RoomPricingVisitor()); // this is called double dispatch
            // try to book single room
            singleRoom.accept(new RoomReservationVisitor());

            doubleRoom.accept(new RoomMaintainenceVisitor());

            deluxeRoom.accept(new RoomPricingVisitor());
            deluxeRoom.accept(new RoomReservationVisitor());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
