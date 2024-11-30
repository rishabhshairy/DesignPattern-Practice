package com.rshairy.designs.DecoratorPattern.decorator;

import com.rshairy.designs.DecoratorPattern.pizza.BasePizza;

/**
 * Here we can see that decorator has-a base pizza and itself is also a base pizza
 */
public class ExtraCheese extends ToppingDecorator {

    BasePizza pizza;

    /**
     * Doing constructor injection so that we can add base pizza object to it
     * and calculate total cost
     *
     * @param pizza
     */
    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 100;
    }
}
