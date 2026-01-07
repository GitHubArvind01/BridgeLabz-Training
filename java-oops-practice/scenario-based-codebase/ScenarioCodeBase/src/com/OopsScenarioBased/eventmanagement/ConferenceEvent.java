package com.OopsScenarioBased.eventmanagement;

public class ConferenceEvent extends Event implements ISchedulable{

	public ConferenceEvent(String location, String date, int attendees) {
		super("Conference", location, date, attendees);
	}

	@Override
	public void schedule() {
		
	}

	@Override
	public void reschedule() {
		
	}

	@Override
	public void cancel() {
		
	}
}
