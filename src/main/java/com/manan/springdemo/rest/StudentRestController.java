package com.manan.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manan.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> students;
	//define @PostConstruct to load the student data only once
	@PostConstruct
	public void loadData()
	{
		students=new ArrayList<>();
		students.add(new Student("Danny","Morrison"));
		students.add(new Student("Kapil","Dev"));
		students.add(new Student("Imran","Khan"));
		students.add(new Student("Brett","Lee"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() 
	{
		if(students.isEmpty() || students==null)
		{
			throw new StudentNotFoundException("No students available");
		}
		return students;
	}

	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable Integer studentId) 
	{
		if( (studentId>=students.size()) || (studentId<0))
		{
			throw new StudentNotFoundException("Student cannot be retrieved as the studentId is not within bounds");
		}
		return students.get(studentId);
	}
	
	
	
}
