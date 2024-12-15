package behavioural.strategy.q2;

import static behavioural.strategy.q2.PricingManager.BASE_FARE;

public class TimeBasedPricingStrategy implements PricingStrategy {

    private static final double PER_MINUTE_RATE = 0.5; // Rate per minute

    @Override
    public PricingType supportsType() {
        return PricingType.TIME_BASED;
    }

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE + PER_MINUTE_RATE * rideDetails.getDuration();
    }
}
