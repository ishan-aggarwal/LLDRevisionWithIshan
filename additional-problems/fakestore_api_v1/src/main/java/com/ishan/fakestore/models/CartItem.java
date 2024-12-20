package com.ishan.fakestore.models;

import lombok.Data;

@Data
public class CartItem {
    private Long productId;
    private int quantity;
}