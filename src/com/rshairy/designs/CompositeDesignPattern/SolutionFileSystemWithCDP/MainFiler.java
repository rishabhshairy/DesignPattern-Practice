package com.rshairy.designs.CompositeDesignPattern.SolutionFileSystemWithCDP;

public class MainFiler {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movies");

        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory horrorMovies = new Directory("Horror-Movies");
        File scaryMovie = new File("Scary Movie I");
        horrorMovies.add(scaryMovie);

        // now add horror movie to movie directory
        movieDirectory.add(horrorMovies);

        movieDirectory.ls();
    }
}
