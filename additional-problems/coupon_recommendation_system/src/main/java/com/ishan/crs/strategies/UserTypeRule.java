package com.ishan.crs.strategies;

import com.ishan.crs.model.Order;

public class UserTypeRule implements Rule {
    private final String allowedUserType;

    public UserTypeRule(String allowedUserType) {
        this.allowedUserType = allowedUserType;
    }

    @Override
    public boolean check(Order order) {
        return order.user().userType().equals(allowedUserType);
    }
}
