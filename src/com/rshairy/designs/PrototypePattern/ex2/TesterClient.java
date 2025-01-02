package com.rshairy.designs.PrototypePattern.ex2;

public class TesterClient {
    public static void main(String[] args) {
        double mass = 10.0;
        double height = 3.7;
        Position position = new Position(3, 7);
        Position otherPosition = new Position(4, 8);

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.clone();
        anotherPlasticTree.setPosition(otherPosition);

        System.out.println(position.equals(plasticTree.getPosition()));
        System.out.println(otherPosition.equals(anotherPlasticTree.getPosition()));
        System.out.println(plasticTree.equals(anotherPlasticTree));
    }
}
