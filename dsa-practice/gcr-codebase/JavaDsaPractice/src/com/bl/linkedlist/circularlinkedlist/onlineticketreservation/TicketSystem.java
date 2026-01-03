package com.bl.linkedlist.circularlinkedlist.onlineticketreservation;

public class TicketSystem {

	private TicketNode head;
	private TicketNode tail;

	// Add ticket at end
	public void addTicket(int id, String customer, String movie, String seat, String time) {
		TicketNode node = new TicketNode(id, customer, movie, seat, time);

		if (head == null) {
			head = tail = node;
			node.next = head; // circular link
			return;
		}

		tail.next = node;
		node.next = head;
		tail = node;
	}

	// Remove ticket by Ticket ID
	public void removeTicket(int id) {
		if (head == null)
			return;

		TicketNode curr = head;
		TicketNode prev = tail;

		do {
			if (curr.ticketId == id) {

				// Single node case
				if (curr == head && curr == tail) {
					head = tail = null;
				}
				// Removing head
				else if (curr == head) {
					head = head.next;
					tail.next = head;
				}
				// Removing tail
				else if (curr == tail) {
					tail = prev;
					tail.next = head;
				}
				// Middle node
				else {
					prev.next = curr.next;
				}
				return;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);

		System.out.println("Ticket not found");
	}

	// Display all tickets
	public void displayTickets() {
		if (head == null) {
			System.out.println("No tickets booked");
			return;
		}

		TicketNode temp = head;
		do {
			displayTicket(temp);
			temp = temp.next;
		} while (temp != head);
	}

	// Search by Customer Name
	public void searchByCustomer(String customer) {
		if (head == null)
			return;

		TicketNode temp = head;
		boolean found = false;
		do {
			if (temp.customerName.equalsIgnoreCase(customer)) {
				displayTicket(temp);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (!found)
			System.out.println("No tickets found for customer");
	}

	// Search by Movie Name
	public void searchByMovie(String movie) {
		if (head == null)
			return;

		TicketNode temp = head;
		boolean found = false;
		do {
			if (temp.movieName.equalsIgnoreCase(movie)) {
				displayTicket(temp);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (!found)
			System.out.println("No tickets found for movie");
	}

	// Count total tickets
	public void countTickets() {
		if (head == null) {
			System.out.println("Total Tickets: 0");
			return;
		}

		int count = 0;
		TicketNode temp = head;
		do {
			count++;
			temp = temp.next;
		} while (temp != head);

		System.out.println("Total Tickets: " + count);
	}

	private void displayTicket(TicketNode t) {
		System.out.println(t.ticketId + " | " + t.customerName + " | " + t.movieName + " | Seat: " + t.seatNumber
				+ " | Time: " + t.bookingTime);
	}

}
