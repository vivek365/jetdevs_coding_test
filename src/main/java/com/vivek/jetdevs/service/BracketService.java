package com.vivek.jetdevs.service;

import org.springframework.stereotype.Service;

@Service
public interface BracketService {

	String removeInvalidBrackets(String text);
}
