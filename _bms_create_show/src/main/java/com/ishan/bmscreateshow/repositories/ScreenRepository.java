package com.ishan.bmscreateshow.repositories;

import com.ishan.bmscreateshow.models.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Integer> {
}
