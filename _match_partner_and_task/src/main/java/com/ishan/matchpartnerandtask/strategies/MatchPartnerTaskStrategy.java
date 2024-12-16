package com.ishan.matchpartnerandtask.strategies;

import com.ishan.matchpartnerandtask.models.Partner;
import com.ishan.matchpartnerandtask.models.PartnerTaskMapping;
import com.ishan.matchpartnerandtask.models.Task;

import java.util.List;

public interface MatchPartnerTaskStrategy {

    public List<PartnerTaskMapping> matchPartnersAndTasks(List<Partner> partners, List<Task> tasks);
}
