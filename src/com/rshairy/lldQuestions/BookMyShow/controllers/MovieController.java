package com.rshairy.lldQuestions.BookMyShow.controllers;

import com.rshairy.lldQuestions.BookMyShow.models.City;
import com.rshairy.lldQuestions.BookMyShow.models.Movie;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVsMovie;
    List<Movie> allMovies;

    public MovieController() {
        cityVsMovie = new LinkedHashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie, City city) {
        // first add to allmovies
        allMovies.add(movie);

        List<Movie> movies = cityVsMovie.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovie.put(city, movies);

    }

    public Movie getMovieByName(String movieName) {
        for (Movie movie : allMovies) {
            if (movie.getName().equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

    public List<Movie> getMoviesByCity(City city) {
        return cityVsMovie.get(city);
    }

    // Define crud operations
}
