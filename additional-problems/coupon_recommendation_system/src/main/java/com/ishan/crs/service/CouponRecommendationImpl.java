package com.ishan.crs.service;

import com.ishan.crs.model.Coupon;
import com.ishan.crs.model.Order;

import java.util.List;

public class CouponRecommendationImpl implements CouponRecommendation {
    private final List<Coupon> availableCoupons;

    public CouponRecommendationImpl(List<Coupon> availableCoupons) {
        this.availableCoupons = availableCoupons;
    }

    @Override
    public List<Coupon> getCoupons(Order order) {
        return availableCoupons.stream().filter(
                coupon -> coupon.isApplicable(order)
        ).toList();
    }
}
