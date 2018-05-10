package com.srikanth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentResource {
	
	@RequestMapping("students")
	public List<Student> getStudents()
	{
		
	List<Student> students = new ArrayList<>();
	
	Student s1 =new Student();
	s1.setStudentID(10);
	s1.setFirstName("John");
	s1.setLastName("Cena");
	
	Student s2 =new Student();
	s1.setStudentID(11);
	s1.setFirstName("Rock");
	s1.setLastName("Ramm");
	
	students.add(s1);
	students.add(s2);
	
	return students;
	}
	
	
}
