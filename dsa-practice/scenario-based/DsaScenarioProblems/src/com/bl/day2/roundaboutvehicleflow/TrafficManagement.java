package com.bl.day3.roundaboutvehicleflow;

import java.util.ArrayDeque;
import java.util.Queue;

public class TrafficManagement {
	Car head;
	Car current;
	Queue<Car> wq = new ArrayDeque<>();
	int maxCapacity = 10; // setting initial size for the roundabout
	int currentCount = 0;

	public void addCarToRoundabout(int carNo) {
		// first check if the roundabout capacity is more then the current count
		if (maxCapacity > currentCount) {
			Car newCar = new Car(carNo);
			if (current != null) {
				current.next = newCar;
				current = newCar;
			} else {
				head = current = newCar; // my very first car
			}
			newCar.next = head;
			System.out.println("Car added successfully!!");
			currentCount++;
		} else {
			System.out.println("Not enough space!!"); // add to waiting queue
			wq.add(new Car(carNo));
			System.out.println("Car added to waiting queue!!");
		}
	}

	// as the car leaves the round-bound we have an empty slot left so we'll check
	// if any car is waiting in the queue
	public void removeCarToRoundabout(int carNo) {
		// roundabout is empty
		if (head == null) {
			System.out.println("Roundabout is empty");
			return;
		}
		Car tempCurrent = head;
		Car prev = null;

		// head itself has the car
		if (head.carNo == carNo) {

			// Only one car in roundabout
			if (head.next == head) { // means we have found the car to be removed but head next point to itself == no
										// car node ahead
				head = null;
			} else {
				// car nodes exist ahead so traverse to the end
				Car last = head;
				while (last.next != head) {
					last = last.next;
				}

				head = head.next; // head is the car make new head and mix the last node's next
				last.next = head;
			}

			System.out.println("Car " + carNo + " removed");
			currentCount--;
			// after removing always check the waiting queue
			if (!wq.isEmpty()) {
				Car newCar = wq.poll(); // get a car from the waiting queue
				// then add that car to the circular-list for that traverse to the last
				Car temp = head;
				while (temp.next != head) {
					temp = temp.next;
				}
				temp.next = newCar;
				newCar.next = head; // make newCar/last point to the head
			} else {
				System.out.println("No car is waiting in queue!!");
			}
			return;
		}

		// Car is not head - search in circle
		prev = head;
		tempCurrent = head.next;

		// loop till the node that points back to the head
		while (tempCurrent != head) {
			if (tempCurrent.carNo == carNo) {
				prev.next = tempCurrent.next;
				System.out.println("Car " + carNo + " removed");
				currentCount--;

				// after removing always check the waiting queue
				if (!wq.isEmpty()) {
					Car newCar = wq.poll(); // get a car from the waiting queue
					// then add that car to the circular-list for that traverse to the last
					Car temp = head;
					while (temp.next != head) {
						temp = temp.next;
					}
					temp.next = newCar;
					newCar.next = head; // make newCar/last point to the head
				} else {
					System.out.println("No car is waiting in queue!!");
				}

				return;
			}
			prev = tempCurrent;
			tempCurrent = tempCurrent.next;
		}

		System.out.println("No such car exists");
	}

	// display the round about 
	public void displayRoundabout() {
	    if (head == null) {
	        System.out.println("Roundabout is empty");
	        return;
	    }
	    Car temp = head;
	    System.out.println("Following are the cars present in the roundabout:");

	    do {
	        System.out.println("Car Number: " + temp.carNo);
	        temp = temp.next;
	    } while (temp != head);
	}
	
	// display the waiting queue
	public void displayWq() {
		System.out.println("Following are the waiting car list: ");
		if(!wq.isEmpty()) {
			for(int i=0;i<wq.size();i++) {
				Car temp = wq.poll();
				System.out.println("Car Number:" + temp.carNo);
			}
		}
		else {
			System.out.println("Oops, no car is waiting!!");
		}
	}

}
