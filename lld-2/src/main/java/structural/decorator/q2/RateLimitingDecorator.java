package structural.decorator.q2;

import structural.decorator.q2.utils.ApiUtils;
import structural.decorator.q2.api.Api;
import structural.decorator.q2.utils.RateLimitExceededException;

/**
 * TODO Task 4a - Extend the {@link BaseApiDecorator} interface to implement rate limiting functionality. Use
 * {@link structural.decorator.q2.utils.ApiUtils#rateLimitExceeded(String)} to check if the rate limit has been exceeded.
 * If it has, throw a {@link structural.decorator.q2.utils.RateLimitExceededException}, else call the next layer in the chain to execute the request.
 * <br />
 * Remember
 * 1. When you inherit from the {@link BaseApiDecorator}, you will have to implement the executeRequest method.
 * 2. You will also need to call the next layer in the chain to execute the request.
 * 3. Each decorator would also need a constructor that takes the next layer of type {@link structural.decorator.q2.api.Api}.
 */
public class RateLimitingDecorator extends BaseApiDecorator {

    public RateLimitingDecorator(Api nextLayer) {
        super(nextLayer);
    }

    @Override
    public String executeRequest(String requestData) {
        if (ApiUtils.rateLimitExceeded(requestData)) {
            throw new RateLimitExceededException("Rate limit exceeded");
        }
        return nextLayer.executeRequest(requestData);
    }
}