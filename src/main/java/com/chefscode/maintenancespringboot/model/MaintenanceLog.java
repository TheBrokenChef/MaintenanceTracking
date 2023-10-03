package com.chefscode.maintenancespringboot.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class MaintenanceLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "task_id")
    private MaintenanceTask maintenanceTask;
    private Date completionDate;
    private String notes;
}
