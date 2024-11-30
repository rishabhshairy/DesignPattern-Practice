package com.rshairy.designs.DecoratorPattern;

import com.rshairy.designs.DecoratorPattern.decorator.ExtraCheese;
import com.rshairy.designs.DecoratorPattern.decorator.ExtraMushroom;
import com.rshairy.designs.DecoratorPattern.pizza.BasePizza;
import com.rshairy.designs.DecoratorPattern.pizza.Farmhouse;

public class Customer {
    public static void main(String[] args) {

        // Here Customer first adds Farmhouse pizza
        // then adds extra cheese on top of if
        // then add extra mushroom
        // we can pass same BasePizza object to new topping

        BasePizza pizza = new Farmhouse();
        pizza = new ExtraCheese(pizza);
        pizza = new ExtraMushroom(pizza);

        System.out.println(pizza.cost());
    }
}
