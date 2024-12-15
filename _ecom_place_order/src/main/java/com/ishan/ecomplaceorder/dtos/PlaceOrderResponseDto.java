package com.ishan.ecomplaceorder.dtos;

import com.ishan.ecomplaceorder.models.Order;
import lombok.Data;

@Data
public class PlaceOrderResponseDto {
    private Order order;
    private ResponseStatus status;
}
