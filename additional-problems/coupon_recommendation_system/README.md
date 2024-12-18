### Problem Statement:

Design a Coupon Recommendation System for Zepto that fulfills the following requirements:

### Key Requirements:

1. Coupon Recommendation:

    - Recommend applicable coupons for a given order.

    - Evaluate rules dynamically based on the user's order.

    - Support conditions like product type, user type, and payment method.

2. Concurrency:

    - Ensure thread safety for rule evaluation when multiple users access the system.
3. Optimization:

    - Optimize the rule evaluation process to minimize redundant checks.

### [](https://lldcoding.com/design-lld-coupon-system-for-zepto-machine-coding-interview?utm_source=hashnode_blog_newsletter&utm_medium=email&utm_campaign=design-lld-coupon-system-for-zepto-machine-coding-interview#heading-concurrency-requirements "Permalink")Concurrency Requirements:

1. Thread safety for concurrent requests.

2. Efficient use of multi-threading during rule evaluations.