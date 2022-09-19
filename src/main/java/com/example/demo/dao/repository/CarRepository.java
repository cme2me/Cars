package com.example.demo.dao.repository;

import com.example.demo.dao.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CarRepository extends JpaRepository<CarEntity ,UUID>, JpaSpecificationExecutor<CarEntity> {
    List<CarEntity> findAllById(UUID id);
}
