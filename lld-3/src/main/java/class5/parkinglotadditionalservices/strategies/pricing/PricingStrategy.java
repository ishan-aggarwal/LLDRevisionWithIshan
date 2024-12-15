package class5.parkinglotadditionalservices.strategies.pricing;

import class5.parkinglotadditionalservices.models.VehicleType;

import java.util.Date;

public interface PricingStrategy {
    double calculateAmount(Date entryTime, Date exitTime, VehicleType vehicleType);
}
