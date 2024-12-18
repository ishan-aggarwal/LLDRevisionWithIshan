package com.ishan.crs.strategies;

import com.ishan.crs.model.Order;

public interface Rule {
    boolean check(Order order);
}
