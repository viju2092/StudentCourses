package io.studcourseboot.model;

import java.util.*;

public class Student {

	private String studentId;
	private String studName;
	private int studAge;
	private List<Course> courses;
	
	public Student(String studentId, String studName, int studAge, List<Course> courses) {
		super();
		this.studentId = studentId;
		this.studName = studName;
		this.studAge = studAge;
		this.courses = courses;
	}

	public String getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getStudName() {
		return studName;
	}
	
	public void setStudName(String studName) {
		this.studName = studName;
	}
	
	public int getStudAge() {
		return studAge;
	}
	
	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	
	public List<Course> getCourses() {
		return courses;
	}
	
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
