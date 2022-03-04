package com.vivek.jetdevs.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.jetdevs.entity.TrainTiming;
import com.vivek.jetdevs.service.TrainService;

@RestController
@RequestMapping("/trains")
public class TrainController {

	@Autowired
	private TrainService trainService;

	@PostMapping("")
	public ResponseEntity<Map<String, Integer>> minimumPlatformsRequired(@RequestBody final TrainTiming trainTiming) throws ParseException {
		Map<String, Integer> returnMap = new HashMap<>();
		returnMap.put("value", trainService.minimumPlatformsRequired(trainTiming));
		return ResponseEntity.ok(returnMap);
	}
}
