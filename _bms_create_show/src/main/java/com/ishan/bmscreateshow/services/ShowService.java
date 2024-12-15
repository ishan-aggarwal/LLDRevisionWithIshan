package com.ishan.bmscreateshow.services;

import com.ishan.bmscreateshow.exceptions.*;
import com.ishan.bmscreateshow.models.Feature;
import com.ishan.bmscreateshow.models.SeatType;
import com.ishan.bmscreateshow.models.Show;
import org.springframework.data.util.Pair;

import java.util.Date;
import java.util.List;

public interface ShowService {
    public Show createShow(int userId, int movieId, int screenId, Date startTime, Date endTime, List<Pair<SeatType, Double>> pricingConfig, List<Feature> features) throws MovieNotFoundException, ScreenNotFoundException, FeatureNotSupportedByScreen, InvalidDateException, UserNotFoundException, UnAuthorizedAccessException;
}
