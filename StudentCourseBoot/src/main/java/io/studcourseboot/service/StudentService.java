package io.studcourseboot.service;

import java.util.*;

import io.studcourseboot.model.Course;
import io.studcourseboot.model.Student;

public interface StudentService {

	public List<Student> retrieveAllStudents();
	
	public List<Course> retrieveAllCourses();
    
	public Student retrieveStudent(String studentId);
	
	public Course retrieveCoursebyId(String courseId);
    
	public List<Course> retrieveCourses(String studentId);
    
	public Course retrieveCourse(String studentId, String courseId);
	
	//public void addCourse(Course cour);
	
	public void deleteCourse(String courseId); 
	
//    public Course addCourse(String studentId, Course course);
}
