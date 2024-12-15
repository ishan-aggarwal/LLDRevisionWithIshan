package behavioural.strategy.q2;

public class PricingManager {

    static final double BASE_FARE = 5.0; // Base fare amount
    private static final double PER_MINUTE_RATE = 0.5; // Rate per minute
    private static final double SURGE_MULTIPLIER = 2.0; // Surge pricing multiplier

    private PricingType pricingType;
    private PricingStrategy pricingStrategy;

    public PricingManager(PricingType pricingType, PricingStrategy pricingStrategy) {
        this.pricingType = pricingType;
        this.pricingStrategy = pricingStrategy;
    }

    public Double calculatePrice(RideDetails rideDetails) {
        return pricingStrategy.calculatePrice(rideDetails);
    }

}