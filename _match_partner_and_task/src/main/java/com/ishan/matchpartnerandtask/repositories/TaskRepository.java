package com.ishan.matchpartnerandtask.repositories;

import com.ishan.matchpartnerandtask.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}