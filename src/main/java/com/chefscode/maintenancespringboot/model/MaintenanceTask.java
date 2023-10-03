package com.chefscode.maintenancespringboot.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class MaintenanceTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Date dueDate;
    @ManyToOne
    @JoinColumn(name = "aircraft_id")
    private Aircraft aircraft;
}
