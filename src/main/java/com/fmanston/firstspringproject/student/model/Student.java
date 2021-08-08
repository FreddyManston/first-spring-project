package com.fmanston.firstspringproject.student.model;

public class Student {
	public int id;
	public String name;
	public int age;
	public School school;
	
	public Student() {
	}
	
	public Student(int id, String name, int age, School school) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.school = school;
	}
	
	public enum School {
		SU,
		UCT,
		UWC,
		WITS
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public School getSchool() {
		return school;
	}
	
	public void setSchool(School school) {
		this.school = school;
	}
	
	@Override
	public String toString() {
		return "{" +
				"id=" + id +
				", name=" + name +
				", age=" + age +
				", school=" + school +
				'}';
	}
}
