package class8.outofstocknotification.repositories;

import class8.outofstocknotification.models.Notification;
import class8.outofstocknotification.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

    List<Notification> findByProduct(Product product);

}
