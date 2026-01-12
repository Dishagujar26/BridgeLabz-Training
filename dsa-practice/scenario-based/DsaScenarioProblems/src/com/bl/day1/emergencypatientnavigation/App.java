package com.bl.day1.emergencypatientnavigation;

public class App {
	public static void main(String[] args) {

		AmbulanceRoute route = new AmbulanceRoute();

		route.addUnit("Emergency", true);
		route.addUnit("Radiology", false);
		route.addUnit("Surgery", true);
		route.addUnit("ICU", false);

		route.display();

		HospitalUnit unit = route.findAvailable();

		if (unit != null)
			System.out.println("Redirect patient to: " + unit.name);
		else
			System.out.println("No unit available!");

		route.removeUnit("Radiology");
		route.display();
	}
}
