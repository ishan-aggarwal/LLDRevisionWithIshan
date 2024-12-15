package com.ishan.ratemovies.services;

import com.ishan.ratemovies.exceptions.MovieNotFoundException;
import com.ishan.ratemovies.exceptions.UserNotFoundException;
import com.ishan.ratemovies.models.Movie;
import com.ishan.ratemovies.models.Rating;
import com.ishan.ratemovies.models.User;
import com.ishan.ratemovies.repositories.MovieRepository;
import com.ishan.ratemovies.repositories.RatingRepository;
import com.ishan.ratemovies.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RatingsServiceImpl implements RatingsService {

    private UserRepository userRepository;
    private MovieRepository movieRepository;
    private RatingRepository ratingRepository;

    @Autowired
    public RatingsServiceImpl(UserRepository userRepository, MovieRepository movieRepository, RatingRepository ratingRepository) {
        this.userRepository = userRepository;
        this.movieRepository = movieRepository;
        this.ratingRepository = ratingRepository;
    }

    @Override
    public Rating rateMovie(int userId, int movieId, int rating) throws UserNotFoundException, MovieNotFoundException {
        User user = this.userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User not found"));
        Movie movie = this.movieRepository.findById(movieId).orElseThrow(() -> new MovieNotFoundException("Movie not found"));

        // Check if user has already rated the movie, then update the rating
        Optional<Rating> optionalRating = this.ratingRepository.findByUserAndMovie(user, movie);
        if(optionalRating.isPresent()){
            Rating ratingObj = optionalRating.get();
            ratingObj.setRating(rating);
            return this.ratingRepository.save(ratingObj);
        }

        Rating ratingObj = new Rating();
        ratingObj.setMovie(movie);
        ratingObj.setUser(user);
        ratingObj.setRating(rating);
        return this.ratingRepository.save(ratingObj);
    }

    @Override
    public double getAverageRating(int movieId) throws MovieNotFoundException {
        this.movieRepository.findById(movieId).orElseThrow(() -> new MovieNotFoundException("Movie not found"));
        return this.ratingRepository.getAverageRatingForMovie(movieId);
    }
}
