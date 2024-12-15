package behavioural.strategy.q2;

public interface PricingStrategy {
    PricingType supportsType();

    Double calculatePrice(RideDetails rideDetails);
}