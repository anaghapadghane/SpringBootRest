package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {
	
	@Autowired
	StudentRepository repo;

	@GetMapping("students")
	public List<Student> getStudents()
	{
		List<Student> students = (List<Student>) repo.findAll();
		
		return students;
	}

	@GetMapping("students/{Name}")
	public List<Student> getStudentsByName(@PathVariable("Name") String name)
	{
		List<Student> students = (List<Student>) repo.findBySname(name);
		
		return students;
	}
	
	@RequestMapping("/students/student/{Id}")
	public Student getStudentById(@PathVariable("Id") Integer Id)
	{
		Student student = repo.findOne(Id);
		
		return student;
	}
	
	@PostMapping("/students/student")
	public void postStudent(@RequestBody Student student)
	{	
		repo.save(student);
	}
	
	@PutMapping("/students/student/{Id}")
	public void putStudent(@RequestBody Student student)
	{	
		repo.save(student);
	}
	
	@DeleteMapping("/students/student/{Id}")
	public void deleteStudent(@PathVariable Integer Id)
	{	
		repo.delete(Id);
	}
	
}
