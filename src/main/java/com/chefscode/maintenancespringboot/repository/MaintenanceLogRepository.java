package com.chefscode.maintenancespringboot.repository;

import com.chefscode.maintenancespringboot.model.MaintenanceLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceLogRepository extends JpaRepository<MaintenanceLog, Long> {
}
