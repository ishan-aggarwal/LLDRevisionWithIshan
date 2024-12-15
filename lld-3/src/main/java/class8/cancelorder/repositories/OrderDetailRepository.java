package class8.cancelorder.repositories;

import class8.cancelorder.models.Order;
import class8.cancelorder.models.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
    List<OrderDetail> findAllByOrder(Order order);
}
