package class6.generatebill.services;

import class6.generatebill.exceptions.CustomerSessionNotFound;
import class6.generatebill.models.*;
import class6.generatebill.repositories.CustomerSessionRepository;
import class6.generatebill.repositories.OrderRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OrderServiceImpl implements OrderService{

    private CustomerSessionRepository customerSessionRepository;
    private OrderRepository orderRepository;

    public OrderServiceImpl(CustomerSessionRepository customerSessionRepository, OrderRepository orderRepository) {
        this.customerSessionRepository = customerSessionRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public Bill generateBill(long userId) throws CustomerSessionNotFound {
        Optional<CustomerSession> optionalCustomerSession = customerSessionRepository.findActiveCustomerSessionByUserId(userId);
        if(optionalCustomerSession.isEmpty()){
            throw new CustomerSessionNotFound("Customer session not found");
        }
        CustomerSession customerSession = optionalCustomerSession.get();
        customerSession.setCustomerSessionStatus(CustomerSessionStatus.ENDED);
        customerSessionRepository.save(customerSession);
        List<Order> orders = orderRepository.findOrdersByCustomerSession(customerSession.getId());
        Map<MenuItem, Integer> consolidatedOrderedItems = new HashMap<>();
        for (Order order : orders) {
            for (Map.Entry<MenuItem, Integer> entry : order.getOrderedItems().entrySet()) {
                consolidatedOrderedItems.put(entry.getKey(), consolidatedOrderedItems.getOrDefault(entry.getKey(), 0) + entry.getValue());
            }
        }
        double totalAmount = 0;
        for (Map.Entry<MenuItem, Integer> entry : consolidatedOrderedItems.entrySet()) {
            totalAmount += entry.getKey().getPrice() * entry.getValue();
        }
        double gst = totalAmount * 0.05;
        double serviceCharge = totalAmount * 0.1;
        double finalTotal = totalAmount + gst + serviceCharge;

        Bill bill = new Bill();
        bill.setGst(gst);
        bill.setServiceCharge(serviceCharge);
        bill.setTotalAmount(finalTotal);
        bill.setOrderedItems(consolidatedOrderedItems);
        return bill;
    }
}
