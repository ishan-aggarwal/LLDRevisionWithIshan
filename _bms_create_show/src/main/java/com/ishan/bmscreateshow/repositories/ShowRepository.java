package com.ishan.bmscreateshow.repositories;

import com.ishan.bmscreateshow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {

    @Override
    Optional<Show> findById(Integer showId);
}