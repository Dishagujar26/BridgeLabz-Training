package com.bl.day5.eventeaseapplication;

public abstract class Event implements ISchedulable{
	
	private final int eventId;          // cannot be edited once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    // protected pricing (encapsulated)
    protected double venueCost;
    protected double serviceCost;
    protected double discount;

    protected User organizer;

    // constructor without packages
    Event(int eventId, String eventName, String location, String date,
          int attendees, double venueCost, User organizer) {

        this(eventId, eventName, location, date, attendees,
             venueCost, 0, 0, organizer);
    }

    // constructor with catering/decoration packages
    Event(int eventId, String eventName, String location, String date,
          int attendees, double venueCost, double serviceCost,
          double discount, User organizer) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
        this.organizer = organizer;
    }

    // cost calculation using operators
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public final int getEventId() {
        return eventId;
    }

    public void cancel() {
        System.out.println(eventName + " has been cancelled.");
    }

}
