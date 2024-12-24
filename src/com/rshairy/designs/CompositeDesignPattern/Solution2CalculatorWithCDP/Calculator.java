package com.rshairy.designs.CompositeDesignPattern.Solution2CalculatorWithCDP;

public class Calculator {
    public static void main(String[] args) {
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression add = new Expression(one,seven,Operation.ADD);
        ArithmeticExpression multiply = new Expression(two,add,Operation.MULTIPLY);

        System.out.println(multiply.evaluate());
    }
}
