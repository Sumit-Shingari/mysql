package com.sumit.shingari.controller;

import org.springframework.web.bind.annotation.*;

import com.sumit.shingari.data.model.Student;
import com.sumit.shingari.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

	private final StudentRepository repository;
	
	@GetMapping("")
	public Iterable<Student> getAllStudents() {
		return repository.findAll();
	}
	
	@PostMapping("")
	public void saveStudent(@RequestBody Student student) {
		repository.save(student);
	}
	
	
}
