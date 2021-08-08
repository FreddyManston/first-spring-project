package com.fmanston.firstspringproject.student.service;

import com.fmanston.firstspringproject.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
	private List<Student> students =
		Arrays.asList(
				new Student(0, "Amy", 24, Student.School.UWC),
				new Student(1, "Becca", 22, Student.School.UCT),
				new Student(2, "Charles", 25, Student.School.SU),
				new Student(3, "Dean", 23, Student.School.WITS)
		);
	
	public String getStudents() {
		return students.toString();
	}
	
	public String getStudentById(int id) {
		for (Student student : students) {
			if (student.getId() == id) {
				return student.toString();
			};
		}
		return null;
	}
	
	public String getStudentByName(String name) {
		for (Student student : students) {
			if (student.getName().equals(name)) {
				return student.toString();
			};
		}
		return null;
	}
	
	@Override
	public String toString() {
		String str_students = "";
		for (Student student : students) {
			str_students = str_students + student.toString();
		}
		return str_students;
	}
}
