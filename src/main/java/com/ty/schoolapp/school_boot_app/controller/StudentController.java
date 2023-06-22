package com.ty.schoolapp.school_boot_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.schoolapp.school_boot_app.dao.StudentDao;
import com.ty.schoolapp.school_boot_app.dto.Student;

@RestController
public class StudentController {
	@Autowired
	StudentDao dao;
	@PostMapping("save")
	public Student saveStudent(@RequestBody Student student) {
		return dao.saveStudent(student);
	}
	@GetMapping("get")
	public Student getStudent(@RequestParam int id) {
		return dao.getStudent(id);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		
		return dao.deleteStudent(id);
	}
	
    @PutMapping("update")
    public Student updateStudent(@RequestBody Student student,@RequestParam int id) {
    	Student student2 =dao.getStudent(id);
    	if(student2!=null) {
    		student.setId(id);
    		return dao.saveStudent(student);
    	}
    	return null;
    }
}
