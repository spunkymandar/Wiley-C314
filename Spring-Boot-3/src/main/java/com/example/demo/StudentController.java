package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return service.getAllStudents();
	}

	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable("id") String id) {
		Student student=service.getStudentById(id);
		
		return student;
	}
	
	@PostMapping("/students")
	public void createStudent(@RequestBody Student student) {
		service.createStudent(student);
	}
	
	@PutMapping("/students/{id}")
	public void updateStudent(@PathVariable("id") String id,
			@RequestBody Student student) {
		service.updateStdentById(id, student);
	}
	
	
//	@Scheduled(fixedRate = 1000)
//	public void continuousTask() {
//		System.out.println("Task is executing");
//	}
	
	
	
}
