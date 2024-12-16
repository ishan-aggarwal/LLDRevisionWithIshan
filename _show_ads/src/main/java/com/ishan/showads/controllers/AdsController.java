package com.ishan.showads.controllers;

import com.ishan.showads.dtos.GetAdvertisementForUserRequestDto;
import com.ishan.showads.dtos.GetAdvertisementForUserResponseDto;
import com.ishan.showads.dtos.ResponseStatus;
import com.ishan.showads.exceptions.UserNotFoundException;
import com.ishan.showads.models.Advertisement;
import com.ishan.showads.services.AdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AdsController {

    private AdsService adsService;

    @Autowired
    public AdsController(AdsService adsService) {
        this.adsService = adsService;
    }

    public GetAdvertisementForUserResponseDto getAdvertisementForUser(GetAdvertisementForUserRequestDto requestDto){
        GetAdvertisementForUserResponseDto responseDto = new GetAdvertisementForUserResponseDto();
        try{
            Advertisement advertisement = adsService.getAdvertisementForUser(requestDto.getUserId());
            responseDto.setAdvertisement(advertisement);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (UserNotFoundException e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
