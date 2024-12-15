package class6.calculaterevenue.repositories;

import class6.calculaterevenue.models.DailyRevenue;

import java.util.Date;
import java.util.List;

public interface DailyRevenueRepository {
    public DailyRevenue save(DailyRevenue dailyRevenue);

    public List<DailyRevenue> getDailyRevenueBetweenDates(Date startDate, Date endDate);
}
