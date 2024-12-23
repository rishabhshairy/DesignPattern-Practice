package com.rshairy.lldQuestions.BookMyShow.controllers;

import com.rshairy.lldQuestions.BookMyShow.models.City;
import com.rshairy.lldQuestions.BookMyShow.models.Movie;
import com.rshairy.lldQuestions.BookMyShow.models.Show;
import com.rshairy.lldQuestions.BookMyShow.models.Theatre;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheater;
    List<Theatre> allTheaters;

    public TheatreController() {
        cityVsTheater = new LinkedHashMap<>();
        allTheaters = new ArrayList<>();
    }

    public void addTheatre(Theatre theatre, City city) {
        allTheaters.add(theatre);

        List<Theatre> theatres = cityVsTheater.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityVsTheater.put(city, theatres);
    }

    public Map<Theatre, List<Show>> getAllShow(Movie interestedMovie, City city) {

        Map<Theatre, List<Show>> allShowsForMovie = new LinkedHashMap<>();

        List<Theatre> theatres = cityVsTheater.get(city);


        for (Theatre theatre : theatres) {
            List<Show> shows = theatre.getShows();
            List<Show> interestedMovieShow = new ArrayList<>();

            // now select list of shows for interested movie
            for (Show show : shows) {
                if (show.getMovie().getMovieId() == interestedMovie.getMovieId()) {
                    interestedMovieShow.add(show);
                }
            }

            // now if interestedMovieShow is not empty put it in map
            if (!interestedMovieShow.isEmpty()) {
                allShowsForMovie.put(theatre, interestedMovieShow);
            }
        }
        return allShowsForMovie;
    }

    // Crud
}
