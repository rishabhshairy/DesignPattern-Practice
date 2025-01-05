package com.rshairy.designs.MementoDesignPattern.simpleExample;

public class ConfigurationMemento {
    private int height;
    private int width;

    public ConfigurationMemento(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "ConfigurationMemento{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
