package com.ty.schoolapp.school_boot_app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.ty.schoolapp.school_boot_app.dto.Student;
import com.ty.schoolapp.school_boot_app.repo.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository repository;
	public Student saveStudent(Student student) {

		return repository.save(student);
	}

	public Student getStudent(int id) {

		return repository.findById(id).get();
	}
	
	public String deleteStudent(int id) {
		
		repository.deleteById(id);
		return "deleted";
	}
}
