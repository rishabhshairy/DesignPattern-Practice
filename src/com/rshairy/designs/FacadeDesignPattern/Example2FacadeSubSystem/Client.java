package com.rshairy.designs.FacadeDesignPattern.Example2FacadeSubSystem;

import com.rshairy.designs.FacadeDesignPattern.Example2FacadeSubSystem.Facade.OrderCreationFacade;

/**
 * Now this client only interacts with Facade,
 * Any Change in SubSystem will not have direct affect
 * Facade will handle all the changes
 */
public class Client {

    public static void main(String[] args) {
        OrderCreationFacade facade = new OrderCreationFacade();
        System.out.println(facade.createOrder());
    }
}
