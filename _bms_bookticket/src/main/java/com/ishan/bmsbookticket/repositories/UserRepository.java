package com.ishan.bmsbookticket.repositories;

import com.ishan.bmsbookticket.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User save(User user);

}
