package com.example.demo.dao.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class CarEntity {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID id;
    private UUID userId;
    private String mark;
    @CreationTimestamp
    private LocalDateTime date;
    private String model;
    private Long mileage;
    private String engine;
    private Long horsePower;
    private String steeringWheel;
    private String carBodyType;
    private String transmission;
    private String gearType;
    private String generation;
    private String winNumber;
    private String engineType;
    private String city;
}
