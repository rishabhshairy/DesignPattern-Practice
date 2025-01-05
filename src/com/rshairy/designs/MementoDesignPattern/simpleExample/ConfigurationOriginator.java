package com.rshairy.designs.MementoDesignPattern.simpleExample;

public class ConfigurationOriginator {
    private int height;
    private int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMemento createMemento() {
        return new ConfigurationMemento(this.height, this.width);
    }

    public void restoreMemento(ConfigurationMemento restoreFromMemento) {
        this.setHeight(restoreFromMemento.getHeight());
        this.setWidth(restoreFromMemento.getWidth());
    }

    @Override
    public String toString() {
        return "ConfigurationOriginator{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
