package com.ishan.ecomplaceorder.services;

import com.ishan.ecomplaceorder.exceptions.*;
import com.ishan.ecomplaceorder.models.Order;
import org.springframework.data.util.Pair;

import java.util.List;

public interface OrderService {

    public Order placeOrder(int userId, int addressId, List<Pair<Integer, Integer>> orderDetails) throws UserNotFoundException, InvalidAddressException, OutOfStockException, InvalidProductException, HighDemandProductException;
}
