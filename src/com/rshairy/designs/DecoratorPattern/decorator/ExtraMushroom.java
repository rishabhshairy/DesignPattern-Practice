package com.rshairy.designs.DecoratorPattern.decorator;

import com.rshairy.designs.DecoratorPattern.pizza.BasePizza;

public class ExtraMushroom extends ToppingDecorator {

    BasePizza pizza;

    public ExtraMushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 50;
    }
}
