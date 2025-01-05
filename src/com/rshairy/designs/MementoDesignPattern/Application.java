package com.rshairy.designs.MementoDesignPattern;

import com.rshairy.designs.MementoDesignPattern.simpleExample.ConfigurationCareTaker;
import com.rshairy.designs.MementoDesignPattern.simpleExample.ConfigurationMemento;
import com.rshairy.designs.MementoDesignPattern.simpleExample.ConfigurationOriginator;

public class Application {
    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();

        ConfigurationOriginator originatorObject = new ConfigurationOriginator(9, 12);

        ConfigurationMemento snapshot1 = originatorObject.createMemento();

        // Add current snapshot to history
        careTaker.addMemento(snapshot1);

        // now change height and save
        originatorObject.setWidth(7);
        originatorObject.setHeight(11);

        ConfigurationMemento snapshot2 = originatorObject.createMemento();
        careTaker.addMemento(snapshot2);

        // now restore without saving

        originatorObject.setHeight(55);
        originatorObject.setWidth(66);

        System.out.println("Before Restore::" + originatorObject);

        ConfigurationMemento restorePoint = careTaker.undo();
        originatorObject.restoreMemento(restorePoint);

        System.out.println("After Restore::" + originatorObject);

    }
}
