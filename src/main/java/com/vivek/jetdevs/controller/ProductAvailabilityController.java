package com.vivek.jetdevs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.jetdevs.service.ProductAvailabilityService;

@RestController
@RequestMapping("/product-service")
public class ProductAvailabilityController {

	@Autowired
	private ProductAvailabilityService productAvailabilityService;

	@GetMapping("/{timeZone}")
	public ResponseEntity<String> isServiceAvailable(@PathVariable final String timeZone) {
		boolean isServiceAvailable = productAvailabilityService.isServiceAvailable(timeZone);
		return ResponseEntity.ok("Service is " + (!isServiceAvailable ? "not " : "" )+ "available.");
	}
}
