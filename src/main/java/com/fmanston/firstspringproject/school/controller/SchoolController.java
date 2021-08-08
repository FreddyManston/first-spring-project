package com.fmanston.firstspringproject.school.controller;

import com.fmanston.firstspringproject.student.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SchoolController {
	
	@RequestMapping("/schools")
	public List<Student.School> getSchools() {
		return Arrays.asList(
				Student.School.UWC,
				Student.School.UCT,
				Student.School.SU,
				Student.School.WITS
		);
	}
}
