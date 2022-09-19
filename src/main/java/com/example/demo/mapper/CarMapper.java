package com.example.demo.mapper;

import com.example.demo.dao.entity.CarEntity;
import com.example.demo.dto.CarDto;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface CarMapper {
    CarDto toCarDto(CarEntity carEntity);

    List<CarDto> toCarDtoPage(List<CarEntity> carEntities);

    List<CarDto> toCarDtoList(List<CarEntity> carEntities);

    CarEntity toCarEntity(CarDto carDto);

    List<CarEntity> toCarEntityList(List<CarDto> carDtoList);
}
