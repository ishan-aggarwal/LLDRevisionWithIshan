package class6.generatebill.controllers;

import class6.generatebill.dtos.*;
import class6.generatebill.models.Bill;
import class6.generatebill.models.Order;
import class6.generatebill.services.OrderService;

public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public GenerateBillResponseDto generateBill(GenerateBillRequestDto requestDto){
        GenerateBillResponseDto responseDto = new GenerateBillResponseDto();
        try {
            Bill bill = orderService.generateBill(requestDto.getUserId());
            responseDto.setBill(bill);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }


}
