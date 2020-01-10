package io.studcourseboot.model;

import java.util.*;

public class Course {

	private String courseId;
	private String courseName;
	private String courseDescription;
	private List<String> steps;
	
	
	public Course(String courseId, String courseName, String courseDescription, List<String> steps) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.steps = steps;
	}

	public String getCourseId() {
		return courseId;
	}
	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseDescription() {
		return courseDescription;
	}
	
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	
	public List<String> getSteps() {
		return steps;
	}
	
	public void setSteps(List<String> steps) {
		this.steps = steps;
	}
	
}
