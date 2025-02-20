package class8.deliveryestimate.repositories;

import class8.deliveryestimate.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findAllByIdIn(List<Integer> ids);
}

