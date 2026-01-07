package com.bl.day5.eventeaseapplication;

public class BirthdayEvent extends Event {
	BirthdayEvent(int eventId, String location, String date, int attendees, User organizer) {

		super(eventId, "Birthday Party", location, date, attendees, 20000, 5000, 2000, organizer);
	}

	public void schedule() {
		System.out.println("Birthday event scheduled with decorations & cake.");
	}

	public void reschedule(String newDate) {
		this.date = newDate;
		System.out.println("Birthday event rescheduled to " + newDate);
	}
}
