package class6.generatebill.repositories;

import class6.generatebill.models.Order;

import java.util.List;

public interface OrderRepository {

    Order save(Order order);

    List<Order> findOrdersByCustomerSession(long customerSessionId);
}
