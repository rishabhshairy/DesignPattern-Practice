package com.rshairy.designs.PrototypePattern.ex2;

public class PineTree extends Tree {
    private String type;

    public PineTree(double mass, double height) {
        super(mass, height);
        this.type = "Pine Tree";
    }

    public String getType() {
        return type;
    }

    @Override
    public Tree clone() {
        PineTree pineTreeCloneObj = new PineTree(this.getMass(), this.getHeight());
        pineTreeCloneObj.setPosition(this.getPosition());
        return pineTreeCloneObj;
    }
}
