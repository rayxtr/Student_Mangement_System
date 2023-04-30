package net.stu.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.stu.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long>{

}
