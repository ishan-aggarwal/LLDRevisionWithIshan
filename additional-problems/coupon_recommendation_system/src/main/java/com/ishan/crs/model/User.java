package com.ishan.crs.model;

import java.util.List;

/**
 * @param userType e.g., Regular, Premium or we can use enum also here.
 */
public record User(String userId, String userType, List<String> pastPurchases) {
}
