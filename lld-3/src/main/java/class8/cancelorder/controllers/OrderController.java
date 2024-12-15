package class8.cancelorder.controllers;

import class8.cancelorder.dtos.CancelOrderRequestDto;
import class8.cancelorder.dtos.CancelOrderResponseDto;
import class8.cancelorder.dtos.ResponseStatus;
import class8.cancelorder.models.Order;
import class8.cancelorder.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public CancelOrderResponseDto cancelOrder(CancelOrderRequestDto cancelOrderRequestDto) {
        CancelOrderResponseDto cancelOrderResponseDto = new CancelOrderResponseDto();
        try{
            Order order = orderService.cancelOrder(cancelOrderRequestDto.getOrderId(), cancelOrderRequestDto.getUserId());
            cancelOrderResponseDto.setOrder(order);
            cancelOrderResponseDto.setStatus(ResponseStatus.SUCCESS);
            return cancelOrderResponseDto;
        } catch (Exception e) {
            e.printStackTrace();
            cancelOrderResponseDto.setStatus(ResponseStatus.FAILURE);
            return cancelOrderResponseDto;
        }
    }

}
