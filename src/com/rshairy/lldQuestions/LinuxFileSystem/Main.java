package com.rshairy.lldQuestions.LinuxFileSystem;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();
        List<String> files = fileSystem.ls("/");
        System.out.println(files);

        fileSystem.mkdir("/a");
        fileSystem.mkdir("/b");
        fileSystem.mkdir("/c/d/e");
        System.out.println(fileSystem.ls("/"));
    }
}
