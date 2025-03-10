package com.rshairy.designs.PrototypePattern;

public class Rectangle extends Shape {

    int length;
    int width;

    public Rectangle() {

    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        if (rectangle != null) {
            this.width = rectangle.width;
            this.length = rectangle.length;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.length == length;
    }
}
