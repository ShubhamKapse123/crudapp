package com.app.crudapp.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.crudapp.dao.StudentRepository;
import com.app.crudapp.dto.StudentDto;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository ;

    @Override
    public ArrayList<StudentDto> findAllEmployee() {
        return (ArrayList<StudentDto>) studentRepository.findAll();
    }
    
    @Override
    public StudentDto findAllEmployeeByID(int id) {
        Optional<StudentDto> opt = studentRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;
    }
    
    @Override
    public void addEmployee() {
        ArrayList<StudentDto> std = new ArrayList<StudentDto>();
        std.add(new StudentDto(101, "Shubham"));
        std.add(new StudentDto(102, "Puneet"));
        std.add(new StudentDto(103, "Abhay"));
        std.add(new StudentDto(104, "Anurag"));
        for (StudentDto student : std) {
            studentRepository.save(student);
        }
    }
    
    @Override
    public void deleteAllData() {
        studentRepository.deleteAll();
    }
}
