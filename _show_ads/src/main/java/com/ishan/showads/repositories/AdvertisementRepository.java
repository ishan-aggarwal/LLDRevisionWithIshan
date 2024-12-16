package com.ishan.showads.repositories;

import com.ishan.showads.models.Advertisement;
import com.ishan.showads.models.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Integer> {

    public List<Advertisement> findAdvertisementsByPreferenceIn(List<Preference> preferences);
}
