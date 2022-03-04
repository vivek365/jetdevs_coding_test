package com.vivek.jetdevs.service.impl;

import org.springframework.stereotype.Service;

import com.vivek.jetdevs.service.StudentGradeService;

@Service
public class StudentGradeServiceImpl implements StudentGradeService {

	@Override
	public String[] convertToGrade(int[] scores) {
		String[] grades = new String[scores.length];

		for (int i = 0; i < scores.length; i++) {
			grades[i] = scores[i] >= 90 ? "A" : scores[i] >= 60 && scores[i] <= 89 ? "B" : "C";
		}
		return grades;
	}

}
