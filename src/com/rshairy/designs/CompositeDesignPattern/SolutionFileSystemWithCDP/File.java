package com.rshairy.designs.CompositeDesignPattern.SolutionFileSystemWithCDP;

public class File implements FileSystem {
    String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("File name:: " + this.name);
    }
}
