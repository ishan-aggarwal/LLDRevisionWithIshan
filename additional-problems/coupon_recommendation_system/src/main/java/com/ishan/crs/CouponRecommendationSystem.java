package com.ishan.crs;

import com.ishan.crs.model.*;
import com.ishan.crs.service.CouponRecommendation;
import com.ishan.crs.service.CouponRecommendationImpl;
import com.ishan.crs.strategies.ProductTypeRule;
import com.ishan.crs.strategies.Rule;
import com.ishan.crs.strategies.UserTypeRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CouponRecommendationSystem {
    public static void main(String[] args) {
        // Create rules
        Rule userTypeRule = new UserTypeRule("Premium");
        Rule productTypeRule = new ProductTypeRule("Groceries");

        // Create coupons
        List<Rule> coupon1Rules = Arrays.asList(userTypeRule, productTypeRule);
        Coupon coupon1 = new Coupon("C1", 100, coupon1Rules, "AND(0, 1)");

        List<Rule> coupon2Rules = List.of(productTypeRule);
        Coupon coupon2 = new Coupon("C2", 50, coupon2Rules, "0");

        // Create data
        User user = new User("U1", "Premium", new ArrayList<>());
        CartItem item = new CartItem("P1", "Groceries", 2, 200);
        Cart cart = new Cart("C1", List.of(item));
        Order order = new Order("O1", user, cart, 400);

        // Recommend coupons
        CouponRecommendation recommendation = new CouponRecommendationImpl(Arrays.asList(coupon1, coupon2));
        List<Coupon> coupons = recommendation.getCoupons(order);

        // Print results
        coupons.forEach(coupon -> System.out.println("Applicable Coupon: " + coupon.discountAmount()));
    }
}
