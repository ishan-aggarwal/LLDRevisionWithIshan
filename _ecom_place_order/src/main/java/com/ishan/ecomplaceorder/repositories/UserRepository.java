package com.ishan.ecomplaceorder.repositories;

import com.ishan.ecomplaceorder.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
