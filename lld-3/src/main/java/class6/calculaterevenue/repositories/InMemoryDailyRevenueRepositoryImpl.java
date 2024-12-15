package class6.calculaterevenue.repositories;

import class6.calculaterevenue.models.DailyRevenue;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static class6.calculaterevenue.utils.DateUtils.equalDates;

public class InMemoryDailyRevenueRepositoryImpl implements DailyRevenueRepository{

    private Map<Long, DailyRevenue> dailyRevenueMap;
    private static long idCounter = 0;

    public InMemoryDailyRevenueRepositoryImpl() {
        this.dailyRevenueMap = new HashMap<>();
    }

    @Override
    public DailyRevenue save(DailyRevenue dailyRevenue) {
        if(dailyRevenue.getId() == 0){
            dailyRevenue.setId(++idCounter);
        }
        dailyRevenueMap.put(dailyRevenue.getId(), dailyRevenue);
        return dailyRevenue;
    }

    @Override
    public List<DailyRevenue> getDailyRevenueBetweenDates(Date startDate, Date endDate) {
        return dailyRevenueMap.values().stream().filter(dailyRevenue -> {
            Date date = dailyRevenue.getDate();
            return (date.compareTo(startDate) >= 0 || equalDates(date, startDate)) && (date.compareTo(endDate) <= 0 || equalDates(date, endDate));
        }).toList();
    }


}
