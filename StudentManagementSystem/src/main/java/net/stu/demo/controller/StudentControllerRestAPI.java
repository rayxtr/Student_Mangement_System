package net.stu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import net.stu.demo.entity.Student;
import net.stu.demo.service.StudentService;

@RestController
@RequestMapping
public class StudentControllerRestAPI {

	 @Autowired
	 private StudentService ss;
	 
		@GetMapping("/management")
		public ResponseEntity<List<Student>> listStudents(){
			
			return new ResponseEntity<>(ss.getAllStudents(),HttpStatus.OK);
			
		}
		
		/*
		 * For Rest API 	
		 */
			
		@PostMapping("/management")
		public ResponseEntity<Student> saveStudent(@RequestBody Student student){
			return new ResponseEntity<>(ss.saveStudent(student),HttpStatus.CREATED);
		}
		
		@GetMapping("/management/{id}")
		public ResponseEntity<Student> getStudents(@PathVariable Long id){
			return new ResponseEntity<>(ss.getStudentById(id),HttpStatus.OK);
		}
		
		
		
		@PostMapping("/management/{id}")
		public ResponseEntity<Student>updateStudent(@PathVariable Long id, Student student){
			Student ex = ss.getStudentById(id);
	
	
		ex.setFirstName(student.getFirstName());
		ex.setLastName(student.getLastName());
		ex.setEmail(student.getEmail());
			
		return new ResponseEntity<>(ss.updateStudent(ex),HttpStatus.CREATED);
		
		}
		
		@DeleteMapping("/management/{id}")
		public ResponseEntity<Student>deleteStudent(@PathVariable Long id){
			return new ResponseEntity<>(ss.deleteStudent2(id),HttpStatus.OK);
		}
	
	
}
