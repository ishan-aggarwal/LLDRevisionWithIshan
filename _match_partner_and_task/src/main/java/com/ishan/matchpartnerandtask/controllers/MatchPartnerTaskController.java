package com.ishan.matchpartnerandtask.controllers;

import com.ishan.matchpartnerandtask.dtos.MatchPartnerTaskRequestDto;
import com.ishan.matchpartnerandtask.dtos.MatchPartnerTaskResponseDto;
import com.ishan.matchpartnerandtask.dtos.ResponseStatus;
import com.ishan.matchpartnerandtask.models.PartnerTaskMapping;
import com.ishan.matchpartnerandtask.services.MatchPartnerTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MatchPartnerTaskController {

    private MatchPartnerTaskService matchPartnerTaskService;

    @Autowired
    public MatchPartnerTaskController(MatchPartnerTaskService matchPartnerTaskService) {
        this.matchPartnerTaskService = matchPartnerTaskService;
    }

    public MatchPartnerTaskResponseDto matchPartnersAndTasks(MatchPartnerTaskRequestDto requestDto) {
        MatchPartnerTaskResponseDto responseDto = new MatchPartnerTaskResponseDto();
        try {
            List<PartnerTaskMapping> partnerTaskMappings = matchPartnerTaskService.matchPartnersAndTasks(requestDto.getPartnerIds(), requestDto.getTaskIds());
            responseDto.setPartnerTaskMappings(partnerTaskMappings);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
