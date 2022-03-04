package com.vivek.jetdevs.entity;

import java.io.Serializable;
import java.util.List;

public class TrainTiming implements Serializable {
	private static final long serialVersionUID = -2823908546850734242L;
	private List<String> arrival;
	private List<String> departure;

	public List<String> getArrival() {
		return arrival;
	}

	public void setArrival(List<String> arrival) {
		this.arrival = arrival;
	}

	public List<String> getDeparture() {
		return departure;
	}

	public void setDeparture(List<String> departure) {
		this.departure = departure;
	}
}
