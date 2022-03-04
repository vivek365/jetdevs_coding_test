package com.vivek.jetdevs.service;

import org.springframework.stereotype.Service;

@Service
public interface ProductAvailabilityService {

	boolean isServiceAvailable(String timeZone);
}
