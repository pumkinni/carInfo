package com.example.carinfo.repository;


import com.example.carinfo.domain.Car;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepositoryCustomImpl implements CarRepositoryCustom{

  @PersistenceContext
  EntityManager em;

  @Override
  public List<Car> getCarListByFetchJoin(){
    String query = " Select car From Car car join fetch car.company ";
    List<Car> carList = em.createQuery(query, Car.class).getResultList();

    return carList;
  }



}
