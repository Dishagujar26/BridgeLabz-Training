package com.bl.linkedlist.circularlinkedlist.onlineticketreservation;

public class TicketMain {
	public static void main(String[] args) {
		TicketSystem trs = new TicketSystem();

		trs.addTicket(1, "Amit", "Inception", "A1", "10:00 AM");
		trs.addTicket(2, "Neha", "Avatar", "B3", "10:05 AM");
		trs.addTicket(3, "Rahul", "Inception", "C2", "10:10 AM");

		trs.displayTickets();
		trs.searchByMovie("Inception");
		trs.countTickets();

		trs.removeTicket(2);
		trs.displayTickets();
	}
}
