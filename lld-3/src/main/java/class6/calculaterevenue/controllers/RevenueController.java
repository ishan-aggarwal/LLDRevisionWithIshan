package class6.calculaterevenue.controllers;

import class6.calculaterevenue.dtos.CalculateRevenueRequestDto;
import class6.calculaterevenue.dtos.CalculateRevenueResponseDto;
import class6.calculaterevenue.dtos.ResponseStatus;
import class6.calculaterevenue.models.AggregatedRevenue;
import class6.calculaterevenue.services.RevenueService;

public class RevenueController {

    private RevenueService revenueService;

    public RevenueController(RevenueService revenueService) {
        this.revenueService = revenueService;
    }

    public CalculateRevenueResponseDto calculateRevenue(CalculateRevenueRequestDto requestDto){
        CalculateRevenueResponseDto responseDto = new CalculateRevenueResponseDto();
        try {
            AggregatedRevenue aggregatedRevenue = revenueService.calculateRevenue(requestDto.getUserId(), requestDto.getRevenueQueryType());
            responseDto.setAggregatedRevenue(aggregatedRevenue);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
