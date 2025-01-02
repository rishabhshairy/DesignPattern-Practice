package com.rshairy.designs.PrototypePattern.ex2;

public class PlasticTree extends Tree {

    private String name;

    public PlasticTree(double mass, double height) {
        super(mass, height);
        this.name = "Plastic Tree";
    }

    @Override
    public Tree clone() {
        PlasticTree plasticTreeCloneObj = new PlasticTree(this.getMass(), this.getHeight());
        plasticTreeCloneObj.setPosition(this.getPosition());
        return plasticTreeCloneObj;
    }
}
