package com.example.demo.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarDto {
    private UUID id;
    private UUID userId;
    private String mark;
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

    public CarDto(String mark, String model,
                  Long mileage, String engine, Long horsePower, String steeringWheel,
                  String carBodyType, String transmission, String gearType, String generation,
                  String winNumber, String engineType, String city) {
        this.mark = mark;
        this.model = model;
        this.mileage = mileage;
        this.engine = engine;
        this.horsePower = horsePower;
        this.steeringWheel = steeringWheel;
        this.carBodyType = carBodyType;
        this.transmission = transmission;
        this.gearType = gearType;
        this.generation = generation;
        this.winNumber = winNumber;
        this.engineType = engineType;
        this.city = city;
    }
}
