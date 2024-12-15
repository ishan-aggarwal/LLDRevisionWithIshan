package com.ishan.bmscreateshow.controllers;

import com.ishan.bmscreateshow.dtos.CreateShowRequestDTO;
import com.ishan.bmscreateshow.dtos.CreateShowResponseDTO;
import com.ishan.bmscreateshow.dtos.ResponseStatus;
import com.ishan.bmscreateshow.models.Show;
import com.ishan.bmscreateshow.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ShowController {

    private ShowService showService;

    @Autowired
    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    public CreateShowResponseDTO createShow(CreateShowRequestDTO requestDTO) {
        CreateShowResponseDTO responseDTO = new CreateShowResponseDTO();
        try{
           Show show = showService.createShow(requestDTO.getUserId(), requestDTO.getMovieId(), requestDTO.getScreenId(), requestDTO.getStartTime(), requestDTO.getEndTime(), requestDTO.getPricingConfig(), requestDTO.getFeatures());
           responseDTO.setShow(show);
           responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e){
            e.printStackTrace();
           responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}
