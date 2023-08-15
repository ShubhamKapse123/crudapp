package com.app.crudapp.services;

import java.util.ArrayList;
import com.app.crudapp.dto.StudentDto;


public interface StudentService {
    ArrayList<StudentDto> findAllEmployee();
    StudentDto findAllEmployeeByID(int id);
    void addEmployee();
    void deleteAllData();
}


