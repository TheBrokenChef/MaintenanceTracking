package com.chefscode.maintenancespringboot.repository;

import com.chefscode.maintenancespringboot.model.MaintenanceTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceTaskRepository extends JpaRepository<MaintenanceTask, Long> {
}
