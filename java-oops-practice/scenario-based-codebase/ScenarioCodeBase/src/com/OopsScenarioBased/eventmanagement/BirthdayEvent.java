package com.OopsScenarioBased.eventmanagement;

public class BirthdayEvent extends Event implements ISchedulable{

	public BirthdayEvent(String location, String date, int attendees) {
		super("Birthday", location, date, attendees);
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
