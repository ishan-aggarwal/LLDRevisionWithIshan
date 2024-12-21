package structural.decorator.q2.api;


import structural.decorator.q2.utils.ApiUtils;
import structural.decorator.q2.utils.Logger;
import structural.decorator.q2.utils.RateLimitExceededException;

public class ECommerceApi {

    private static final String API_ENDPOINT = "http://ecommerce.api";

    public String executeRequest(String requestData) {

        Logger.log("Processing request: " + requestData);

        if (!ApiUtils.rateLimitExceeded(API_ENDPOINT)) {
            throw new RateLimitExceededException("Rate limit exceeded for API endpoint: " + API_ENDPOINT);
        }

        String response = ApiUtils.callAPI(API_ENDPOINT, requestData);
        Logger.log("Response: " + response);

        return response;
    }
}