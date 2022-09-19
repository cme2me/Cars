package com.example.demo.controller;

import com.example.demo.dto.CarDto;
import com.example.demo.dto.ResponseMessage;
import com.example.demo.service.impl.CarServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class CarController {
    private final CarServiceImpl carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @PostMapping(value = "/forSale")
    public ResponseEntity<ResponseMessage> saveCar(
            @RequestParam("mark") String mark,
            @RequestParam("model") String model,
            @RequestParam("mileage") Long mileage,
            @RequestParam("engine") String engine,
            @RequestParam("horsePower") Long horsePower,
            @RequestParam("steeringWheel") String steeringWheel,
            @RequestParam("carBodyType") String carBodyType,
            @RequestParam("transmission") String transmission,
            @RequestParam("gearType") String gearType,
            @RequestParam("generation") String generation,
            @RequestParam("winNumber") String winNumber,
            @RequestParam("engineType") String engineType,
            @RequestParam("city") String city) {
        CarDto carDto = new CarDto(mark, model, mileage, engine, horsePower,
                steeringWheel, carBodyType, transmission, gearType, generation, winNumber,
                engineType, city);
        carService.saveCar(carDto);
        return ResponseEntity.ok().body(new ResponseMessage("Машина успешно выставлена на продажу"));
    }

    @GetMapping("showcars")
    public ResponseEntity<List<CarDto>> showAll() {
        return ResponseEntity.ok().body(carService.showAllCars());
    }

    @GetMapping("/showById")
    public ResponseEntity<List<CarDto>> showCarsById(@RequestParam("id") UUID id) {
        List<CarDto> carDtos = carService.showCarsById(id);
        return ResponseEntity.ok().body(carDtos);
    }
}
