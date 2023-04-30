package net.stu.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.stu.demo.entity.Student;
import net.stu.demo.repo.StudentRepo;
import net.stu.demo.service.StudentService;

@Service	
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepo stud;
	
	@Override
	public List<Student> getAllStudents(){
		
		
		
		return stud.findAll();
	}
	
	@Override
	public Student saveStudent(Student student) {
		
		return stud.save(student);
	}

	@Override
	public Student getStudentById(Long Id) {
		return stud.findById(Id).get();
		
	}

	@Override
	public Student updateStudent(Student student) {
		return stud.save(student);
		
	}

	@Override
	public void deleteStudent(Long Id) {
		// TODO Auto-generated method stub
		 stud.deleteById(Id);
	}
	
	
	
}
