package com.example.carinfo.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "company")
@Data
public class Company extends BaseEntity{
  public Company(){}

  public Company(String companyName, String companyNation){
    this.companyName = companyName;
    this.companyNation = companyNation;
    super.setCreatedAt(new Date());
    super.setUpdatedAt(new Date());
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "company_name")
  private String companyName;

  @Column(name = "company_nation")
  private String companyNation;


}
