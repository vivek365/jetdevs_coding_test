package com.vivek.jetdevs.service;

import org.springframework.stereotype.Service;

@Service
public interface StudentGradeService {

	String[] convertToGrade(int[] scores);
}
