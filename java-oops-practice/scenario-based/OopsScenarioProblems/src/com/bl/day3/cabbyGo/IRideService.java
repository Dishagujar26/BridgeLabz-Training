package com.bl.day3.cabbyGo;

public interface IRideService {

	void bookRide(Vehicle v, Driver d, double distance);
	void endRide();
}
