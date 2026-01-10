package com.bl.day7.pharmacysystem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	List<Medicine> list = new ArrayList<>();
     
	public void addMedicine(Medicine m) {
		list.add(m);
	}
}
