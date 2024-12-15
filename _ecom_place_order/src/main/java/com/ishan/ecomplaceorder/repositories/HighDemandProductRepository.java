package com.ishan.ecomplaceorder.repositories;

import com.ishan.ecomplaceorder.models.HighDemandProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HighDemandProductRepository extends JpaRepository<HighDemandProduct, Integer> {

    List<HighDemandProduct> findAllByProductIdIn(List<Integer> ids);

}
