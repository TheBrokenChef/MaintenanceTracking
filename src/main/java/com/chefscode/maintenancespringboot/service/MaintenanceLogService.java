package com.chefscode.maintenancespringboot.service;

import com.chefscode.maintenancespringboot.repository.MaintenanceLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceLogService {

    @Autowired
    private MaintenanceLogRepository repository;
}
