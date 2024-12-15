package com.ishan.ecomplaceorder.repositories;

import com.ishan.ecomplaceorder.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findAllByIdIn(List<Integer> ids);
}

