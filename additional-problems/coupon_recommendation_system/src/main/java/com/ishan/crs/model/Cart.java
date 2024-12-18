package com.ishan.crs.model;

import java.util.List;

public record Cart(String cartId, List<CartItem> items) {

}
