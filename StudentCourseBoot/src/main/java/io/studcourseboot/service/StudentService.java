package io.studcourseboot.service;

import java.util.*;

import io.studcourseboot.model.Course;
import io.studcourseboot.model.Student;

public interface StudentService {

	public List<Student> retrieveAllStudents();
    public Student retrieveStudent(String studentId);
    public List<Course> retrieveCourses(String studentId);
    public Course retrieveCourse(String studentId, String courseId);
//    public Course addCourse(String studentId, Course course);
}
