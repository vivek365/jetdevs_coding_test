package com.vivek.jetdevs.service;

import java.text.ParseException;

import org.springframework.stereotype.Service;

import com.vivek.jetdevs.entity.TrainTiming;

@Service
public interface TrainService {

	int minimumPlatformsRequired(TrainTiming trainTiming) throws ParseException;

}
