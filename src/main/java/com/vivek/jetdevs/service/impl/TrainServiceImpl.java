package com.vivek.jetdevs.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vivek.jetdevs.entity.ArrivalDepart;
import com.vivek.jetdevs.entity.TrainTiming;
import com.vivek.jetdevs.service.TrainService;

@Service
public class TrainServiceImpl implements TrainService {
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

	@Override
	public int minimumPlatformsRequired(TrainTiming trainTiming) throws ParseException {
		int cnt = 1;

		List<ArrivalDepart> arrivalsDeparts = new ArrayList<>();
		for (int i = 0; i < trainTiming.getArrival().size(); i++) {
			arrivalsDeparts.add(new ArrivalDepart(sdf.parse(trainTiming.getArrival().get(i)),
					sdf.parse(trainTiming.getDeparture().get(i))));
		}

		for (int i = 1; i < arrivalsDeparts.size(); i++) {
			int innerCount = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (arrivalsDeparts.get(j).getDeparture().after(arrivalsDeparts.get(i).getArrival())) {
					innerCount++;
				} else {
					break;
				}
			}

			if (innerCount > cnt) {
				cnt = innerCount;
			}
		}
		return cnt;
	}

}
