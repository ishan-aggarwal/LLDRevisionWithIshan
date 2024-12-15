package com.ishan.bmscreateshow.repositories;

import com.ishan.bmscreateshow.models.SeatTypeShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatTypeShowRepository extends JpaRepository<SeatTypeShow, Integer> {

}
