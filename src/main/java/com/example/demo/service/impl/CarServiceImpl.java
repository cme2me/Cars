package com.example.demo.service.impl;

import com.example.demo.dao.entity.CarEntity;
import com.example.demo.dao.repository.CarRepository;
import com.example.demo.dto.CarDto;
import com.example.demo.mapper.CarMapper;
import com.example.demo.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class CarServiceImpl implements CarService {

    private final CarMapper mapper;

    private final CarRepository carRepository;

    public CarServiceImpl(CarMapper mapper, CarRepository carRepository) {
        this.mapper = mapper;
        this.carRepository = carRepository;
    }

    @Override
    public void saveCar(CarDto carDto) {
        try {
            carDto.setDate(LocalDateTime.now());
            carDto.setUserId(UUID.randomUUID());
            CarEntity carEntity = mapper.toCarEntity(carDto);
            carRepository.save(carEntity);
        } catch (Exception e) {
            log.info("Something went wrong");
        }
    }

    @Override
    public List<CarDto> showAllCars() {
        try {
            List<CarEntity> carEntities = carRepository.findAll();
            return mapper.toCarDtoList(carEntities);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<CarDto> showCarsById(UUID id) {
        List<CarEntity> carEntities = carRepository.findAllById(id);
        return mapper.toCarDtoList(carEntities);
    }
}
