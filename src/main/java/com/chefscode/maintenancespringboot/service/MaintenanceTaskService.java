package com.chefscode.maintenancespringboot.service;

import com.chefscode.maintenancespringboot.repository.MaintenanceTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceTaskService {

    @Autowired
    private MaintenanceTaskRepository repository;
}
