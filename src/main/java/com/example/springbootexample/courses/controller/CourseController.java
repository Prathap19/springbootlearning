package com.example.springbootexample.courses.controller;

import java.util.Arrays;
import java.util.List;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootexample.courses.clssrc.Course;

@RestController
public class CourseController {
	
	//http:localhost:8080/study
	@GetMapping("/study")
	public List<Course> getAllSubjects(){
		return Arrays.asList(new Course(1, "Machine learning", "in1semester"));
		
	}

}
