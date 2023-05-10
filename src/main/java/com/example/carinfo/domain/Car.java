package com.example.carinfo.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "car")
@Data
public class Car extends BaseEntity{
  public Car(){

  }

  public Car(String modelName, Company company, Integer passengerCapacity){
    this.modelName = modelName;
    this.company = company;
    this.passengerCapacity = passengerCapacity;
    super.setCreatedAt(new Date());
    super.setUpdatedAt(new Date());
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name="model_name")
  private String modelName;

  @ManyToOne
  @JoinColumn(name="company_id")
  private Company company;

  @Column(name = "passenger_capacity")
  private Integer passengerCapacity;


}
