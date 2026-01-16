package com.bl.day4.patientsortingbycriticality;

import java.util.ArrayList;
import java.util.List;

public class CriticalitySorting {
	List<Patient> list = new ArrayList<>();
	int patientCount = 0;

	public void addPatient(Patient p) {

		if (patientCount < 10) {
			list.add(p);
			patientCount++;
		}
		else {
			System.out.println("Enough Patients!!");
		}
	}
	
	public void sortPatient() {
		for(int i=0;i<list.size()-1;i++) {
			for(int j=0;j<list.size()-i-1;j++) {
				if(list.get(i).criticality < list.get(j).criticality) {
					Patient p = list.get(i);
					Patient p2 = list.get(j);
					list.set(j, p);
					list.set(i,p2);
				}
				
			}
		}
	}
	
	
	public void display() {
		int count = 1;
		for(Patient p : list) {
			System.out.print("Patient "+count+" Information: ");
			System.out.println(p);
			count++;
		}
	}
	
}
