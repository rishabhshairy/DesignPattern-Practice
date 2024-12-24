package com.rshairy.designs.CompositeDesignPattern.ProblemStatementFileSys;

public class Main {
    public static void main(String[] args) {
        File file = new File("java.txt");
        Directory directory = new Directory("Codes");
        directory.add(file);
        directory.add(new Directory("Samples"));

        directory.ls();
    }
}
