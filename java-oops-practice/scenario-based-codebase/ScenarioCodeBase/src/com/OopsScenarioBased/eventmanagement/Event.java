package com.OopsScenarioBased.eventmanagement;

public class Event {
	private String eventName;
	private String location;
	private String date;
	private int attendees;
	
	public Event(String eventName, String location, String date, int attendees) {
		this.eventName = eventName;
		this.location = location;
		this.date = date;
		this.attendees = attendees;
	}
	public String getEventName() {
		return eventName;
	}

	public String getLocation() {
		return location;
	}

	public String getDate() {
		return date;
	}

	public int getAttendees() {
		return attendees;
	}
}
