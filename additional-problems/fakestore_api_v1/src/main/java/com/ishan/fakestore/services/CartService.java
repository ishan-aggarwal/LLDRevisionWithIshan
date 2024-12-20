package com.ishan.fakestore.services;

import com.ishan.fakestore.models.Cart;

import java.util.List;


public interface CartService {
    List<Cart> getAllCarts();

    Cart getCartById(Long id);

    List<Cart> getCartsLimited(int limit);

    List<Cart> getCartsSorted(String sort);

    List<Cart> getCartsByDateRange(String startDate, String endDate);

    List<Cart> getCartsByUserId(Long userId);

    Cart addCart(Cart cart);

    Cart updateCart(Long id, Cart cart);

    void deleteCart(Long id);
}