package com.bl.day5.eventeaseapplication;

public class ConferenceEvent extends Event {
	ConferenceEvent(int eventId, String location, String date, int attendees, User organizer) {

		super(eventId, "Conference", location, date, attendees, 50000, 15000, 5000, organizer);
	}

	public void schedule() {
		System.out.println("Conference scheduled with speakers and AV setup.");
	}

	public void reschedule(String newDate) {
		this.date = newDate;
		System.out.println("Conference rescheduled to " + newDate);
	}
}
