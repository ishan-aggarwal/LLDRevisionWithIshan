package com.ishan.showads.services;

import com.ishan.showads.exceptions.UserNotFoundException;
import com.ishan.showads.models.Advertisement;

public interface AdsService {

    public Advertisement getAdvertisementForUser(int userId) throws UserNotFoundException;
}
