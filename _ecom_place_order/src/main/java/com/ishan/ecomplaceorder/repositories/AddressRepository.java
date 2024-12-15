package com.ishan.ecomplaceorder.repositories;


import com.ishan.ecomplaceorder.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
