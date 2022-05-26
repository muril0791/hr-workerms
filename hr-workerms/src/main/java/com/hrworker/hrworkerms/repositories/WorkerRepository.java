package com.hrworker.hrworkerms.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hrworker.hrworkerms.entities.Worker;
public interface WorkerRepository extends JpaRepository<Worker,Long> {
    
}
