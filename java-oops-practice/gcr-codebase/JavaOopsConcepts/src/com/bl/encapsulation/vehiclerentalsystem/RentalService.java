package com.bl.encapsulation.vehiclerentalsystem;

public class RentalService {
	public static void main(String[] args) {

		Vehicle[] vehicles = { new Car("CAR101", 2000, "POL123"), new Bike("BIKE201", 500), new Truck("TRK301", 4000) };

		for (Vehicle v : vehicles) {
			double rent = v.calculateRentalCost(3);
			double insurance = 0;

			if (v instanceof Insurable) {
				insurance = ((Insurable) v).calculateInsurance();
			}

			System.out.println("Vehicle Rent: ₹" + rent + ", Insurance: ₹" + insurance);
		}
	}
}
