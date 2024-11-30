package com.rshairy.designs.FactoryPattern;

public class ShapeFactory {
    Shape getShape(String figure) {
        switch (figure) {
            case "RECTANGLE": return new Rectangle();
            case "TRIANGLE": return new Triangle();
            case "CIRCLE": return new Circle();
            default: return null;
        }
    }
}
