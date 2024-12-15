package class8.outofstocknotification.repositories;

import class8.outofstocknotification.models.Inventory;
import class8.outofstocknotification.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

   Optional<Inventory> findByProduct(Product product);

}
