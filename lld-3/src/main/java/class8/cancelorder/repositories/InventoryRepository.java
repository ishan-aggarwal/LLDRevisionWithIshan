package class8.cancelorder.repositories;

import class8.cancelorder.models.Inventory;
import class8.cancelorder.models.Product;
import jakarta.persistence.LockModeType;
import jakarta.persistence.QueryHint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
    Inventory findByProduct(Product product);

}
