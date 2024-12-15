package class6.placeorder.services;

import class6.placeorder.exceptions.CustomerSessionNotFound;
import class6.placeorder.exceptions.InvalidMenuItem;
import class6.placeorder.exceptions.UserNotFoundException;
import class6.placeorder.models.Bill;
import class6.placeorder.models.Order;

import java.util.Map;

public interface OrderService {

    public Order placeOrder(long userId, Map<Long,Integer> orderedItems) throws UserNotFoundException, InvalidMenuItem;

}
