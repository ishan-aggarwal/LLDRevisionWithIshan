package class5.parkinglotadditionalservices.strategies.pricing;

import class5.parkinglotadditionalservices.respositories.SlabRepository;

import java.util.Calendar;
import java.util.Date;

public class PricingStrategyFactory {

    private SlabRepository slabRepository;

    public PricingStrategyFactory(SlabRepository slabRepository) {
        this.slabRepository = slabRepository;
    }

    public PricingStrategy getPricingStrategy(Date exitTime){
        Calendar cal = Calendar.getInstance();
        cal.setTime(exitTime);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        if(dayOfWeek == 1 || dayOfWeek == 7){
            return new WeekendPricingStrategy(slabRepository);
        }
        else {
            return new WeekdayPricingStrategy();
        }
    }
}
