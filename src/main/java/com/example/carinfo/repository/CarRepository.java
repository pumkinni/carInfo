package com.example.carinfo.repository;


import com.example.carinfo.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long>, CarRepositoryCustom {



}
