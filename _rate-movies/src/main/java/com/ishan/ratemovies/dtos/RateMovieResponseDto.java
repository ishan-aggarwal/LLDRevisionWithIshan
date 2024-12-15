package com.ishan.ratemovies.dtos;

import com.ishan.ratemovies.models.Rating;
import lombok.Data;

@Data
public class RateMovieResponseDto {
    private ResponseStatus responseStatus;
    private Rating rating;
}
