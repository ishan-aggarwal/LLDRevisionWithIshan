package class6.placeorder.controllers;

import class6.placeorder.dtos.*;
import class6.placeorder.models.Bill;
import class6.placeorder.models.Order;
import class6.placeorder.services.OrderService;

public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    public PlaceOrderResponseDto placeOrder(PlaceOrderRequestDto requestDto){
        PlaceOrderResponseDto responseDto = new PlaceOrderResponseDto();
        try {
            Order order = orderService.placeOrder(requestDto.getUserId(), requestDto.getOrderedItems());
            responseDto.setOrder(order);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }

}
