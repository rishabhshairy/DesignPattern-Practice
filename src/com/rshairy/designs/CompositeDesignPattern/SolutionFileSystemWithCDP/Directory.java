package com.rshairy.designs.CompositeDesignPattern.SolutionFileSystemWithCDP;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    String name;
    List<FileSystem> fileSystems;

    public Directory(String name) {
        this.name = name;
        fileSystems = new ArrayList<>();
    }

    @Override
    public void ls() {
        System.out.println("Directory Name:: " + this.name);

        // listing all files
        for (FileSystem fileSystem : fileSystems) {
            fileSystem.ls();
        }
    }

    public void add(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }
}
