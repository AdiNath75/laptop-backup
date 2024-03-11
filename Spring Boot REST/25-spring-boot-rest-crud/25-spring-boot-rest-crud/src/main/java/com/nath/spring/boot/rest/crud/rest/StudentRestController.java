package com.nath.spring.boot.rest.crud.rest;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nath.spring.boot.rest.crud.entity.Student;

import jakarta.annotation.PostConstruct;


@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;

	// define @PostConstruct to load the student data only once!
	@PostConstruct
	public void loadData() {

		theStudents = new ArrayList<>();

		theStudents.add(new Student("Pournima", "Patel"));
		theStudents.add(new Student("Mario", "Rossi"));
		theStudents.add(new Student("Mary", "Smith"));

	}

	// define end point for "/studying" - return list of students
	@GetMapping("/students")
	public List<Student> getStudents() {

		return theStudents;
	}
	
	// define end point for "/students/{studentId}" - return student at index
		@GetMapping("/students/{studentId}")
		public Student getStudent(@PathVariable int studentId) {

			// just index into the list

			// check the sudentId against list size
			if ((studentId >= theStudents.size()) || (studentId < 0)) {
				throw new StudentNotFoundException("Student id not found - " + studentId);
			}
			return theStudents.get(studentId);
		}	

}
