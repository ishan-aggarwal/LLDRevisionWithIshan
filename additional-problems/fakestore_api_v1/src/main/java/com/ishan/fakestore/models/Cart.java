package com.ishan.fakestore.models;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Cart {
    private Long id;
    private Long userId;
    private LocalDate date;
    private List<CartItem> products;
}