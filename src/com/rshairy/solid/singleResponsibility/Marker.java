package com.rshairy.solid.singleResponsibility;

public class Marker {
    private int year;
    private String color;
    private int price;

    public Marker(int year, String color, int price) {
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
