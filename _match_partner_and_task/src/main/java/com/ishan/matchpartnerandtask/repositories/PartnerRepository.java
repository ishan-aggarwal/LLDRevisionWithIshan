package com.ishan.matchpartnerandtask.repositories;

import com.ishan.matchpartnerandtask.models.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long> {

}
