package com.example.carinfo.domain;

import java.util.Date;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class BaseEntity {
  @Temporal(value= TemporalType.TIMESTAMP)
  private Date createdAt;

  @Temporal(value = TemporalType.TIMESTAMP)
  private Date updatedAt;

}
