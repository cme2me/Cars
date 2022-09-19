package com.example.demo.service;


import com.example.demo.dto.CarDto;
import com.example.demo.dto.PageDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public interface CarService {
    void saveCar(CarDto carDto);

    List<CarDto> showAllCars();

    List<CarDto> showCarsById(UUID id);
}
