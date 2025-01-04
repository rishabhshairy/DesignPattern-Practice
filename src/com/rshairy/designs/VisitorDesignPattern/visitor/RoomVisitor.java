package com.rshairy.designs.VisitorDesignPattern.visitor;

import com.rshairy.designs.VisitorDesignPattern.element.DeluxeRoomElement;
import com.rshairy.designs.VisitorDesignPattern.element.DoubleRoomElement;
import com.rshairy.designs.VisitorDesignPattern.element.SingleRoomElement;

/**
 * Here we are accepting all types of Rooms
 */
public interface RoomVisitor {
    void visit(SingleRoomElement room) throws Exception;

    void visit(DoubleRoomElement room) throws Exception;

    void visit(DeluxeRoomElement room) throws Exception;
}
