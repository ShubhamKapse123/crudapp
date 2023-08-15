package com.app.crudapp.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.app.crudapp.dto.StudentDto;

@EnableJpaRepositories
@Repository
public interface StudentRepository  extends JpaRepository<StudentDto, Integer>{
    
}
