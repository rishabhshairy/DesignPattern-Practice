package com.rshairy.designs.CompositeDesignPattern.Solution2CalculatorWithCDP;

public class Number implements ArithmeticExpression {

    int num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public int evaluate() {
        return this.num;
    }
}
