package io.studcourseboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.studcourseboot.model.Course;
import io.studcourseboot.model.Student;
import io.studcourseboot.service.StudentServiceImpl;

@RestController
@RequestMapping("/studentCourse")
public class StudentController {

	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@GetMapping("/allstudents")
	public List<Student> retrieveAllStudents() {
	   return studentServiceImpl.retrieveAllStudents();
	}
	
	@GetMapping("/allcourses")
	public List<Course> retrieveAllCourses() {
	   return studentServiceImpl.retrieveAllCourses();
	}
	
	@GetMapping("/studentinfo/{sid}")
	public Student retrieveStudent(@PathVariable("sid") String studentId) {
	     return studentServiceImpl.retrieveStudent(studentId);	
	}
	
	@GetMapping("/courseinfo/{cid}")
	public Course retrieveCoursebyId(@PathVariable("cid") String courseId) {
	     return studentServiceImpl.retrieveCoursebyId(courseId);	
	}
	
	@GetMapping("/courses/{id}")
	public List<Course> retrieveCourses(@PathVariable("id") String studentId) {
		return studentServiceImpl.retrieveCourses(studentId);	
	}
	
	@GetMapping("/{studentId}/{courseId}")
	public Course retrieveCourse(@PathVariable("studentId") String studentId, 
			@PathVariable("courseId") String courseId) {
		return studentServiceImpl.retrieveCourse(studentId, courseId);
	}
	
	@DeleteMapping("/deletecourse/{cid}")
	public void deleteCourse(@PathVariable("cid") String courseId) {
		studentServiceImpl.deleteCourse(courseId);
		//System.out.println("The course with id " + courseId + "has been deleted Successfully");
	}
	
	/*
	 * @PostMapping("/newcourses") public @ResponseBody void addCourse(@RequestBody
	 * Course c) { studentServiceImpl.addCourse(c); }
	 */	
}
