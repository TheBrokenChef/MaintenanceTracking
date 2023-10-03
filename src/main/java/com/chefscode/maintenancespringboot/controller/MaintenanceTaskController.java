package com.chefscode.maintenancespringboot.controller;

import com.chefscode.maintenancespringboot.service.MaintenanceTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/maintenance/tasks")
public class MaintenanceTaskController {

    @Autowired
    private MaintenanceTaskService service;
}
