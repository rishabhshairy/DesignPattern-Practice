package com.rshairy.lldQuestions.BookMyShow;

import com.rshairy.lldQuestions.BookMyShow.controllers.MovieController;
import com.rshairy.lldQuestions.BookMyShow.controllers.TheatreController;
import com.rshairy.lldQuestions.BookMyShow.enums.SeatCategory;
import com.rshairy.lldQuestions.BookMyShow.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {
    MovieController movieController;
    TheatreController theatreController;

    public BookMyShow() {
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initialize();

        // user 1
        bookMyShow.createBooking(City.BENGALURU, "Bahubali");
        bookMyShow.createBooking(City.BENGALURU, "Bahubali");
    }

    private void createBooking(City city, String movieName) {
        // Step 1 -- fetch all movies from city showing
        List<Movie> movies = movieController.getMoviesByCity(city);

        // Select movie which user is interested in
        Movie interestedMovie = null;
        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                interestedMovie = movie;
                break;
            }
        }

        // Step 3 get all shows of interested movie
        Map<Theatre, List<Show>> showsInTheatre = theatreController.getAllShow(interestedMovie, city);

        // Step 4 -- Select a particular show user is interested in
        Map.Entry<Theatre, List<Show>> entry = showsInTheatre.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        // select seats
        int seatNum = 30;
        List<Integer> bookedSeats = interestedShow.getBookedSeatIds();
        if (!bookedSeats.contains(seatNum)) {
            // now book
            bookedSeats.add(seatNum);

            // start payment
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();

            for (Seat screenSeat : interestedShow.getScreen().getSeats()) {
                if (screenSeat.getSeatId() == seatNum) {
                    myBookedSeats.add(screenSeat);
                }
            }

            booking.setBookedSeats(myBookedSeats);
            booking.setBookedShow(interestedShow);
        } else {
            System.err.println("Seat Already Booked , try again!!!");
            return;
        }
        System.out.println("Booking Success full");


    }

    private void initialize() {

        // create movies
        createMovies();

        // create theatres
        createTheaters();
    }

    private void createTheaters() {
        Movie avengerMovie = movieController.getMovieByName("Avengers");
        Movie baahubali = movieController.getMovieByName("Bahubali");


        Theatre inoxTheatre = new Theatre();
        inoxTheatre.setId(1);
        inoxTheatre.setScreens(createScreen());
        inoxTheatre.setCity(City.BENGALURU);
        List<Show> inoxShows = new ArrayList<>();
        Show inoxMorningShow = createShows(1, inoxTheatre.getScreens().get(0), avengerMovie, 8);
        Show inoxEveningShow = createShows(2, inoxTheatre.getScreens().get(0), baahubali, 16);
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheatre.setShows(inoxShows);


        Theatre pvrTheatre = new Theatre();
        pvrTheatre.setId(2);
        pvrTheatre.setScreens(createScreen());
        pvrTheatre.setCity(City.DELHI);
        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow = createShows(3, pvrTheatre.getScreens().get(0), avengerMovie, 13);
        Show pvrEveningShow = createShows(4, pvrTheatre.getScreens().get(0), baahubali, 20);
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvrTheatre.setShows(pvrShows);

        theatreController.addTheatre(inoxTheatre, City.BENGALURU);
        theatreController.addTheatre(pvrTheatre, City.DELHI);


    }

    private Show createShows(int id, Screen screen, Movie movie, int startTime) {
        Show show = new Show();
        show.setShowId(id);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setStartTime(startTime);
        return show;
    }

    private List<Screen> createScreen() {
        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setId(1);
        screen1.setSeats(createSeats());

        screens.add(screen1);
        return screens;
    }

    private List<Seat> createSeats() {
        // create seats of different categories
        List<Seat> seats = new ArrayList<>();

        // 1 - 40 Silver
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setCategory(SeatCategory.SILVER);
            seats.add(seat);
        }
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setCategory(SeatCategory.GOLD);
            seats.add(seat);
        }
        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }
        return seats;
    }

    private void createMovies() {
        Movie avengers = new Movie();
        avengers.setMovieId(1);
        avengers.setName("Avengers");
        avengers.setDuration(180);

        Movie bahubali = new Movie();
        bahubali.setMovieId(2);
        bahubali.setName("Bahubali");
        bahubali.setDuration(150);

        movieController.addMovie(avengers, City.BENGALURU);
        movieController.addMovie(avengers, City.DELHI);
        movieController.addMovie(bahubali, City.BENGALURU);
        movieController.addMovie(bahubali, City.DELHI);
    }
}
