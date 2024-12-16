package com.ishan.matchpartnerandtask.services;

import com.ishan.matchpartnerandtask.models.Partner;
import com.ishan.matchpartnerandtask.models.PartnerTaskMapping;
import com.ishan.matchpartnerandtask.models.Task;
import com.ishan.matchpartnerandtask.repositories.PartnerRepository;
import com.ishan.matchpartnerandtask.repositories.TaskRepository;
import com.ishan.matchpartnerandtask.strategies.MatchPartnerTaskStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchPartnerTaskServiceImpl implements MatchPartnerTaskService{

    private PartnerRepository partnerRepository;
    private TaskRepository taskRepository;
    private MatchPartnerTaskStrategy matchPartnerTaskStrategy;

    @Autowired
    public MatchPartnerTaskServiceImpl(PartnerRepository partnerRepository, TaskRepository taskRepository, MatchPartnerTaskStrategy matchPartnerTaskStrategy) {
        this.partnerRepository = partnerRepository;
        this.taskRepository = taskRepository;
        this.matchPartnerTaskStrategy = matchPartnerTaskStrategy;
    }

    @Override
    public List<PartnerTaskMapping> matchPartnersAndTasks(List<Long> partnerIds, List<Long> taskIds) {
        List<Partner> partners = partnerRepository.findAllById(partnerIds);
        List<Task> tasks = taskRepository.findAllById(taskIds);
        return matchPartnerTaskStrategy.matchPartnersAndTasks(partners, tasks);
    }
}
