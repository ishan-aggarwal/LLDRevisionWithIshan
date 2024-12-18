package com.ishan.crs.model;

public record Order(String orderId, User user, Cart cart, double totalAmount) {
}
