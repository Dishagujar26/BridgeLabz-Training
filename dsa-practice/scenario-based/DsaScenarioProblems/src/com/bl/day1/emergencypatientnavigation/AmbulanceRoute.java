package com.bl.day1.emergencypatientnavigation;

class AmbulanceRoute {

	HospitalUnit head = null;

	// Add a new unit into circular list
	void addUnit(String name, boolean available) {
		HospitalUnit newUnit = new HospitalUnit(name, available);

		if (head == null) {
			head = newUnit;
			newUnit.next = head;
			return;
		}

		HospitalUnit temp = head;
		//loop till the last unit
		while (temp.next != head)
			temp = temp.next;

		// add new unit at last
		temp.next = newUnit;
		// add new last unit to first unit
		newUnit.next = head;
		
	}

	// Find nearest available unit
	HospitalUnit findAvailable() {
		if (head == null)
			return null;

		// loop to find the unit 
		HospitalUnit temp = head;
		do {
			if (temp.available)
				return temp;
			temp = temp.next;
		} while (temp != head);

		return null; // no unit available
	}

	// Remove unit (maintenance)
	void removeUnit(String name) {
		if (head == null)
			return;

		HospitalUnit curr = head, prev = null;

		do {
			if (curr.name.equals(name)) {
				if (curr == head) {
					HospitalUnit last = head;
					while (last.next != head)
						last = last.next;

					head = head.next;
					last.next = head;
				} else {
					prev.next = curr.next;
				}
				System.out.println(name + " is under maintenance!");
				return;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);
	}

	void display() {
		if (head == null)
			return;

		HospitalUnit temp = head;
		do {
			System.out.print(temp.name + " -> ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("(back to " + head.name + ")");
	}
}
