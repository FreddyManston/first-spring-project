package com.fmanston.firstspringproject.student.controller;

import com.fmanston.firstspringproject.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService students;
	
	@RequestMapping("/students")
	public String getStudents() {
		return students.getStudents();
	}
	
	@RequestMapping("/students/{id}") //e.g. localhost:8080/students/0
	public String getStudentById(@PathVariable("id")String id) {
		try {
			String student = students.getStudentById(Integer.parseInt(id));
			if(student != null) {
				return student;
			}
			else {
				return "No student with id=" + id + " found.";
			}
		}
		catch (NumberFormatException e) {
			return "Student ID must be a numerical value.";
		}
	}
	
	@RequestMapping("/students/") //e.g. localhost:8080/students?name=Amy
	public String getStudentByName(@RequestParam("name")String name) {
		String student = students.getStudentByName(name);
		if(student != null) {
			return student;
		}
		else {
			return "No student with name=" + name + " found.";
		}
	}
}