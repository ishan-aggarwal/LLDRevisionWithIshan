package structural.decorator.q2;

import lombok.AllArgsConstructor;
import structural.decorator.q2.api.Api;

/**
 * TODO Task 3a - Each decorator should have the same methods as the product it decorates i.e. executeRequest
 * Inherit from the API interface {@link structural.decorator.q2.api.Api}.
 */
@AllArgsConstructor
public abstract class BaseApiDecorator implements Api {
    /**
     * TODO Task 3b - Each decorator will have to call the next decorator in the chain and finally call the {@link structural.decorator.q2.api.SimpleEcommerceAPI} to execute the request.
     * To achieve this, you will need to store a reference to the next layer. Add a field that stores the next layer of
     * type {@link structural.decorator.q2.api.Api}.
     */
    protected Api nextLayer;
}