package net.stu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.stu.demo.entity.Student;
import net.stu.demo.service.StudentService;

@Controller

public class StudentController {
	@Autowired
	private StudentService  ss;
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		
		model.addAttribute("students",ss.getAllStudents());
		
		return "students";
		
	}
	

	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		Student student = new Student();
		model.addAttribute("student",student);
		
		return "create_student";
	}
	
	
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student")Student student) {
		
		ss.saveStudent(student);
		return "redirect:/students";
		
	}
	

	
	@GetMapping("/students/edit/{id}")
	public String getStudent(@PathVariable Long id, Model model) {
		model.addAttribute("student",ss.getStudentById(id));
		
		return "edit_student";
		
	}
	
//	
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, 
		@ModelAttribute("student") Student student, Model model) {
		
		Student ex = ss.getStudentById(id);
		ex.setFirstName(student.getFirstName());
		ex.setLastName(student.getLastName());
		ex.setEmail(student.getEmail());
		
		ss.updateStudent(ex);
		return "redirect:/students";
	}
	
//
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		ss.deleteStudent(id);
		
		return "redirect:/students";
	}
	

	
}
