package com.karan.aroundadviceexample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AroundAdviceService {
	@Autowired
	private StudentManagerImpl stdMan;
	
	public void aroundget() {
		
	Student std=	stdMan.getStudentById(1);
	
	stdMan.createStudent(new Student());
		
		
	}

}
