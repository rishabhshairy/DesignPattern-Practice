package com.rshairy.designs.MementoDesignPattern.simpleExample;

import java.util.Stack;

public class ConfigurationCareTaker {
    Stack<ConfigurationMemento> history = new Stack<>();

    public void addMemento(ConfigurationMemento memento) {
        history.add(memento);
    }

    /**
     * This is the most important function
     */
    public ConfigurationMemento undo() {
        if (!history.isEmpty()) {
            ConfigurationMemento restorePoint = history.pop();
            return restorePoint;
        }
        return null;
    }
}
