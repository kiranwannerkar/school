package com.ty.schoolapp.school_boot_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.schoolapp.school_boot_app.dto.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>{
	

}
