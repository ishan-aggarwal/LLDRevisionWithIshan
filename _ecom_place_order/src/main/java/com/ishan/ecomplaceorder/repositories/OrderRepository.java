package com.ishan.ecomplaceorder.repositories;

import com.ishan.ecomplaceorder.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
