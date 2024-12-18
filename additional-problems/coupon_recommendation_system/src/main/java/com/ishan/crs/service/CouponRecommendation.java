package com.ishan.crs.service;

import com.ishan.crs.model.Coupon;
import com.ishan.crs.model.Order;

import java.util.List;

public interface CouponRecommendation {
    List<Coupon> getCoupons(Order order);
}
