package com.ishan.matchpartnerandtask.services;

import com.ishan.matchpartnerandtask.models.PartnerTaskMapping;

import java.util.List;

public interface MatchPartnerTaskService {

    public List<PartnerTaskMapping> matchPartnersAndTasks(List<Long> partnerIds, List<Long> taskIds);
}
