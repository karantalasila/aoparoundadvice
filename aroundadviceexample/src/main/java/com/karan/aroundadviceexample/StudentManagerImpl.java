package com.karan.aroundadviceexample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class StudentManagerImpl {
	
	 public Student getStudentById(Integer studentId)
	    {
	        System.out.println("Method getStudentById() called");
	        return new Student();
	    }
	 
	    public List<Student> getAllStudents()
	    {
	        System.out.println("Method getAllStudents() called");
	        return new ArrayList<Student>();
	    }
	 
	    public void createStudent(Student student)
	    {
	        System.out.println("Method createStudent() called");
	    }
	 
	    public void deleteStudent(Integer StudentId)
	    {
	        System.out.println("Method deleteStudent() called");
	    }
	 
	    public void updateStudent(Student student)
	    {
	        System.out.println("Method updateStudent() called");
	    }

		
}
