package com.vivek.jetdevs.service.impl;

import java.time.LocalTime;
import java.time.ZoneId;

import org.springframework.stereotype.Service;

import com.vivek.jetdevs.service.ProductAvailabilityService;

@Service
public class ProductAvailabilityServiceImpl implements ProductAvailabilityService {

	@Override
	public boolean isServiceAvailable(final String timeZone) {
		final LocalTime lt = LocalTime.now(ZoneId.of(timeZone));
		return lt.getHour() >= 9 && lt.getHour() < 18;
	}

}
