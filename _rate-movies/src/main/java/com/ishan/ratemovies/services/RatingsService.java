package com.ishan.ratemovies.services;

import com.ishan.ratemovies.exceptions.MovieNotFoundException;
import com.ishan.ratemovies.exceptions.UserNotFoundException;
import com.ishan.ratemovies.models.Rating;

public interface RatingsService {

    public Rating rateMovie(int userId, int movieId, int rating) throws UserNotFoundException, MovieNotFoundException;

    public double getAverageRating(int movieId) throws MovieNotFoundException;
}
