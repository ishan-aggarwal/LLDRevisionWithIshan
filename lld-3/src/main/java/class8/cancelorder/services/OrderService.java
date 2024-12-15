package class8.cancelorder.services;

import class8.cancelorder.exceptions.*;
import class8.cancelorder.models.Order;
import org.springframework.data.util.Pair;

import java.util.List;

public interface OrderService {


    public Order cancelOrder(int orderId, int userId)  throws UserNotFoundException, OrderNotFoundException, OrderDoesNotBelongToUserException, OrderCannotBeCancelledException;
}
