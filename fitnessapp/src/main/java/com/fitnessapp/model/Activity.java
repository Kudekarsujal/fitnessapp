package com.fitnessapp.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double distance;
    private int caloriesBurned;

    @ManyToOne
    private User user;

    // Getters and setters
}
