package com.bl.day2.compartmentnavigationsystem;

public class CompartmentNavigation {
	Compartment current;

	public void addCompartment(int no) {
		Compartment newCamprt = new Compartment(no);
		if (current != null) {
			current.next = newCamprt;
			newCamprt.prev = current;
		}
		current = newCamprt;
	}

	public Compartment navigateBack() {
		if (current != null && current.prev != null) {
			current = current.prev;
			return current.prev;
		} else {
			System.out.println("Sorry, no compartments");
			return null;
		}
	}

	public Compartment navigateForword() {
		if (current != null && current.next != null) {
			current = current.next;
			return current;
		} else {
			System.out.println("Sorry, no compartments");
			return null;
		}
	}

	public void removeCompartment(int no) {
		if (current == null) {
			System.out.println("No compartments available");
			return;
		}

		Compartment temp = current;

		// move to the first node
		while (temp.prev != null) {
			temp = temp.prev;
		}

		// search for the compartment
		while (temp != null) {
			if (temp.no == no) {

				// deleting first node
				if (temp.prev == null) {
					if (temp.next != null) // there is node after the first node
						
						temp.next.prev = null;
				}

				// deleting middle node
				else if (temp.next != null) {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
				}

				// deleting last node
				else {
					temp.prev.next = null;
				}

				// if current is deleted
				if (current == temp) {
					if (temp.next != null) // current was not the last 
						current = temp.next;
					else
						current = temp.prev; // current was the last 
				}

				System.out.println("Compartment removed");
				return;
			}

			temp = temp.next;
		}

		System.out.println("Compartment not found");
	}

	// display two adjacent compartments here
	public void showAdjacent() {
		if (current == null) {
			System.out.println("No compartments");
			return;
		}

		if (current.prev != null)
			System.out.println("Previous: " + current.prev.no);
		else
			System.out.println("Previous: No compartment ");

		System.out.println("Current: " + current.no);

		if (current.next != null)
			System.out.println("Next: " + current.next.no);
		else
			System.out.println("Next: No compartment");
	}

	// display all compartments 
	public void showAllCompartment() {
		if (current == null) {
			System.out.println("No compartments in tarin!!");
			return;
		}

		// first from current go to the first compartment
		Compartment temp = current;
		while (temp.prev != null) {
			temp = temp.prev;
		}
        
		//now the temp points to the very first compartment 
		while(temp.next != null) {
			System.out.println("Compartment No: "+ temp.no);
			temp = temp.next;
		}
	}

}
