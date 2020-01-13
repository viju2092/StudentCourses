package io.studcourseboot.service;

//import java.math.BigInteger;
import java.util.*;

import org.springframework.stereotype.Service;

import io.studcourseboot.model.Course;
import io.studcourseboot.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	private static List<Student> studdata = new ArrayList<>();
	private static List<Course> coursedata = new ArrayList<>();
	

	static {

		Course course1 = new Course("C200", "Java in Spring Boot", "Powerful Framework",
				Arrays.asList("OOPs", "IOC & DI", "Annotations", "Bean"));

		Course course2 = new Course("C201", "Operating Systems", "Memory Management",
				Arrays.asList("Windows OS", "Ubuntu", "Hardware", "Software"));

		Course course3 = new Course("C202", "Network Security", "Cyber Crime World",
				Arrays.asList("ASP.NET", "ADO.NET", "Portability", "Windows Forms"));

		Course course4 = new Course("C203", ".NET", "Microsoft Windows Framework",
				Arrays.asList("OOPs", "Concurrency", "Collections", "Generics"));

		Course course5 = new Course("C204", "DBMS", "Structured Query Language",
				Arrays.asList("MSSQL Server", "MySQL", "PL-SQL", "Oracle DB"));

		Course course6 = new Course("C205", "Data Structures", "Automation and Algorthims",
				Arrays.asList("0-1 Knapsack", "Kruskal", "Dijkstra", "Floyd Warshall"));

		coursedata.add(course1);
		coursedata.add(course2);
		coursedata.add(course3);
		coursedata.add(course4);
		coursedata.add(course5);
		coursedata.add(course6);
		
		Student arun = new Student("S1", "Arun", 28, Arrays.asList(course1, course5, course6));
		Student mukesh = new Student("S2", "Mukesh", 27, Arrays.asList(course2, course4, course6));
		Student chandra = new Student("S3", "Chandra", 28, Arrays.asList(course2, course3, course4, course6));
		Student sabari = new Student("S4", "Sabari", 29, Arrays.asList(course1, course4, course5, course6));
		Student proxy = new Student("S5", "Proxten", 32, Arrays.asList(course1, course2, course5, course6));
		Student navani = new Student("S6", "Navneeth", 26, Arrays.asList(course1, course4, course5, course6));
		Student vijay = new Student("S7", "Vijay", 27, Arrays.asList(course1, course3, course5, course6));

		studdata.add(arun);
		studdata.add(mukesh);
		studdata.add(chandra);
		studdata.add(sabari);
		studdata.add(proxy);
		studdata.add(navani);
		studdata.add(vijay);

	}

	public List<Student> retrieveAllStudents() {
		return studdata;
	}

	public List<Course> retrieveAllCourses() {
		return coursedata;
	}
	
	public Student retrieveStudent(String studentId) {
		for (Student st : studdata) {
			if (st.getStudentId().equals(studentId)) {
				return st;
			}
		}
		return null;
	}

	public Course retrieveCoursebyId(String courseId) {
		for (Course cr : coursedata) {
			if (cr.getCourseId().equals(courseId)) {
				return cr;
			}
		}
		return null;
	}

	
	public List<Course> retrieveCourses(String studentId) {
		Student stud = retrieveStudent(studentId);

		if (studentId.equalsIgnoreCase("Sabari")) {
			throw new RuntimeException("Something went wrong");
		}

		if (stud == null) {
			return null;
		}

		return stud.getCourses();
	}

	public Course retrieveCourse(String studentId, String courseId) {
		Student stud = retrieveStudent(studentId);

		if (stud == null) {
			return null;
		}

		for (Course cour : stud.getCourses()) {
			if (cour.getCourseId().equals(courseId)) {
				return cour;
			}
		}
		return null;
	}
   /*
	public void addCourse(Course cour) {

		cour  = new Course("C206", "Artificial Intelligence", "Machine Learing in DWH",
				Arrays.asList("Image Processing", "Speed Recognition", "Robotics", "Pattern Recognition"));
        
		coursedata.add(cour);
		
		cour = new Course("C207", "Numerical Methods", "Mathematics",
				Arrays.asList("Round Off Errors", "Polynomials & Equations", 
						"ODE", "Algebra"));
		coursedata.add(cour);
		
		cour = new Course("C208", "Sofware Engineering", "E-Commerce Functionality",
				Arrays.asList("Program Design", "Fundamentals of SDLC", 
						"Quality Assurance", "Configuration Management"));
		
		coursedata.add(cour);
		
		cour = new Course("C209", "Microcontroller & Microprocesser", 
				"Design & Development", Arrays.asList("Interface Circuits", "Macros & Assemblers", 
						"Signals & Communications", "8051 Architecture"));
        
		coursedata.add(cour);
		
		cour = new Course("C210", "Probability & Statistics", "Scientific Methodology",
				Arrays.asList("Mean Medium & Variance", "Binomial Distributions", 
						"Standard Deviation", "Graph Theory"));
        
	    coursedata.add(cour);
			   
	   System.out.println("New Courses Inserted Successfully");
	  }
	 */

	public void deleteCourse(String courseId) {
		Course co = retrieveCoursebyId(courseId);
		coursedata.remove(co);
		
	}
}
