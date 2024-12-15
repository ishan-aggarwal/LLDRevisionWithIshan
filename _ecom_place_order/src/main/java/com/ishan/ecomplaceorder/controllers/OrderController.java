package com.ishan.ecomplaceorder.controllers;

import com.ishan.ecomplaceorder.dtos.PlaceOrderRequestDto;
import com.ishan.ecomplaceorder.dtos.PlaceOrderResponseDto;
import com.ishan.ecomplaceorder.dtos.ResponseStatus;
import com.ishan.ecomplaceorder.models.Order;
import com.ishan.ecomplaceorder.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public PlaceOrderResponseDto placeOrder(PlaceOrderRequestDto placeOrderRequestDto) {
        PlaceOrderResponseDto placeOrderResponseDto = new PlaceOrderResponseDto();
        try{
            Order order = orderService.placeOrder(placeOrderRequestDto.getUserId(), placeOrderRequestDto.getAddressId(), placeOrderRequestDto.getOrderDetails());
            placeOrderResponseDto.setOrder(order);
            placeOrderResponseDto.setStatus(ResponseStatus.SUCCESS);
            return placeOrderResponseDto;
        } catch (Exception e) {
            e.printStackTrace();
            placeOrderResponseDto.setStatus(ResponseStatus.FAILURE);
            return placeOrderResponseDto;
        }
    }

}
