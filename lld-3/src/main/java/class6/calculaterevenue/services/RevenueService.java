package class6.calculaterevenue.services;

import class6.calculaterevenue.exceptions.UnAuthorizedAccess;
import class6.calculaterevenue.exceptions.UserNotFoundException;
import class6.calculaterevenue.models.AggregatedRevenue;

public interface RevenueService {
    public AggregatedRevenue calculateRevenue(long userId, String queryType) throws UnAuthorizedAccess, UserNotFoundException;
}
