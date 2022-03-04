package com.vivek.jetdevs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.jetdevs.service.StudentGradeService;

@RestController
@RequestMapping("/students")
public class StudentGradeController {

	@Autowired
	private StudentGradeService studentGradeService;

	@PostMapping("")
	public ResponseEntity<String[]> convertToGrade(@RequestBody final int[] scores) {
		return ResponseEntity.ok(studentGradeService.convertToGrade(scores));
	}
}
