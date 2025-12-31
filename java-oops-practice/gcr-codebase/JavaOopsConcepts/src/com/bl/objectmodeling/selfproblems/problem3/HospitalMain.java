package com.bl.objectmodeling.selfproblems.problem3;

public class HospitalMain {

	public static void main(String[] args) {
		
		//Association: Doctor and Patient are independent objects. (many-to-many)

		Hospital hospital = new Hospital("City Hospital");

		Doctor d1 = new Doctor("Dr. Rao");
		Doctor d2 = new Doctor("Dr. Mehta");

		Patient p1 = new Patient("Disha");
		Patient p2 = new Patient("Aman");

		hospital.addDoctor(d1);
		hospital.addDoctor(d2);

		hospital.addPatient(p1);
		hospital.addPatient(p2);

		d1.consult(p1);
		d1.consult(p2);
		d2.consult(p1);
	}
}
