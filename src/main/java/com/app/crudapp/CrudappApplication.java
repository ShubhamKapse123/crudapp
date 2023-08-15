package com.app.crudapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.crudapp.dto.StudentDto;
import com.app.crudapp.services.StudentServiceImpl;

@SpringBootApplication
public class CrudappApplication implements CommandLineRunner {
	
@Autowired
private StudentServiceImpl studentServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(CrudappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<StudentDto> stlist=studentServiceImpl.findAllEmployee();
		for(StudentDto st:stlist) {
			System.out.println(st.toString());
		}
		System.out.println("Job completed");
	}

}
