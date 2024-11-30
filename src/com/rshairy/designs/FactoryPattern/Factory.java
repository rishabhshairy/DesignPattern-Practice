package com.rshairy.designs.FactoryPattern;

public class Factory {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.getShape("RECTANGLE").draw();
    }
}
