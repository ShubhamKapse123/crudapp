package com.app.crudapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="st")
public class StudentDto {
 @Id
 @Column(name="stid")
 private int stId;
 @Column(name="stname")
 private String stName;

 @Override
public String toString() {
    return "StudentDto [stId=" + stId + ", stName=" + stName + "]";
}

public StudentDto() {
     super();
 }
 
public StudentDto(int stId, String stName) {
    this.stId = stId;
    this.stName = stName;
}   
}
