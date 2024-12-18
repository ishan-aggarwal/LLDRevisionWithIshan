package com.ishan.crs.model;

import com.ishan.crs.strategies.Rule;

import java.util.List;

/**
 * @param rulesFormula Logical formula, e.g., "AND(0, 1)"
 */
public record Coupon(String couponId, double discountAmount, List<Rule> rules, String rulesFormula) {

    public boolean isApplicable(Order order) {
        for (Rule rule : rules) {
            if (!rule.check(order)) {
                return false;
            }
        }
        return true;
    }
}
