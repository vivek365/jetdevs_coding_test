package com.vivek.jetdevs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.jetdevs.entity.Bracket;
import com.vivek.jetdevs.service.BracketService;

@RestController
@RequestMapping("/brackets")
public class BracketController {

	@Autowired
	private BracketService bracketService;

	@PostMapping("")
	public ResponseEntity<Bracket> removeInvalidBrackets(@RequestBody final Bracket bracket) {
		bracket.setText(bracketService.removeInvalidBrackets(bracket.getText()));
		return ResponseEntity.ok(bracket);
	}
}
