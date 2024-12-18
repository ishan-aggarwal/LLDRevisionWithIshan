package com.ishan.crs.strategies;

import com.ishan.crs.model.CartItem;
import com.ishan.crs.model.Order;

public class ProductTypeRule implements Rule {
    private final String requiredProductType;

    public ProductTypeRule(String requiredProductType) {
        this.requiredProductType = requiredProductType;
    }

    @Override
    public boolean check(Order order) {
        for (CartItem item : order.cart().items()) {
            if (item.productType().equals(requiredProductType)) {
                return true;
            }
        }
        return false;
    }
}
