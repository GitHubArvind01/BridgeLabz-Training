package com.OopsScenarioBased.eventmanagement;

public class WeddingEvent extends Event implements ISchedulable{

	public WeddingEvent(String location, String date, int attendees) {
		super("Wedding",location, date, attendees);
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
