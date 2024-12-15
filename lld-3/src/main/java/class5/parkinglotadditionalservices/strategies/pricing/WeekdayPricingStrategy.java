package class5.parkinglotadditionalservices.strategies.pricing;

import class5.parkinglotadditionalservices.models.VehicleType;
import class5.parkinglotadditionalservices.utils.DateTimeUtils;

import java.util.Date;

public class WeekdayPricingStrategy implements PricingStrategy{

    @Override
    public double calculateAmount(Date entryTime, Date exitTime, VehicleType vehicleType) {
        int hours = DateTimeUtils.calculateHours(entryTime, exitTime);
        return hours * 10;
    }
}
