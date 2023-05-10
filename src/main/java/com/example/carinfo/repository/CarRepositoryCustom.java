package com.example.carinfo.repository;


import com.example.carinfo.domain.Car;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepositoryCustom{
  List<Car> getCarListByFetchJoin();




}
