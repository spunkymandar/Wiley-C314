package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private List<Student> studentList=
			new ArrayList<Student>(
					Arrays.asList(
							new Student("1","Ram","20"),
							new Student("2","Arun","30"),
							new Student("3","Kartik","50")
							)
					);

	public List<Student> getAllStudents(){
		return studentList;
	}
	
	public void createStudent(Student s) {
		studentList.add(s);
	}
	
	
	public Student getStudentById(String id) {
		//replace it with lambda
		Student student=null;
		for(Student s:studentList) {
			if(s.getId().equals(id))
				student=s;
		}
		return student;
	}
	
	public void updateStdentById(String id,Student student) {
		int counter=0;
		for(Student s:studentList) {
			if(s.getId().equals(id))
				studentList.set(counter, student);
			counter++;
		}
		
	}
	
	public void deleteStudentById(String id) {
		//remove it with lambda or stream
		int counter=0;
		for(Student s:studentList) {
			if(s.getId().equals(id))
				studentList.remove(counter);
			counter++;
		}
		
	}
	
	
}
