package com.rshairy.designs.VisitorDesignPattern.element;

import com.rshairy.designs.VisitorDesignPattern.visitor.RoomVisitor;

public interface RoomElement {
    void accept(RoomVisitor visitor) throws Exception;
}
