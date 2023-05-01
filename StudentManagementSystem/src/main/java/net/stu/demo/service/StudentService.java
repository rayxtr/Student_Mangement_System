package net.stu.demo.service;

import java.util.List;

import net.stu.demo.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentById(Long Id);
	Student updateStudent(Student student);
	
	void deleteStudent(Long id);
	
	Student deleteStudent2(Long id);
	
}
