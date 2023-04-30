package net.stu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.stu.demo.entity.Student;
import net.stu.demo.repo.StudentRepo;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepo stud;
	@Override
	public void run(String...args) throws Exception{
		
//		Student st1 = new Student("Ankit","amoli","ankit@gmail.com");
//		stud.save(st1);
//
//		Student st2 = new Student("snkit","am","snkit@gmail.com");
//		stud.save(st2);
//
//		Student st3 = new Student("znkit","moli","ant@gmail.com");
//		stud.save(st3);
//
//		Student st4 = new Student("Ant","li","kit@gmail.com");
//		stud.save(st4);
//
//		Student st5 = new Student("Ankit","amoli","ankit@gmail.com");
//		stud.save(st5);
	}
}
