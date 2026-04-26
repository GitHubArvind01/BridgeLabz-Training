package com.OopsScenarioBased.eventmanagement;
import java.util.*;

public class EventManagement {
	static Map<Integer,Event> eventList = new HashMap<>();
	
	
	public void addEvent(Event newEvent) {
		eventList.put(generateId(),newEvent);
		System.out.println("Added event.");
	}
	
	//this method remove the all event by id
	public void removeEvent(int id) {
		for(var event : eventList.entrySet()) {
			if(event.getKey()==id) {
				eventList.remove(id);
				System.out.println("Removed event.");
				return;
			}
		}
		System.out.println("Event not found with id "+id);
	}
	
	//this method view all the event
	public void viewEvent() {
		int i = 1;
		System.out.println("-----------------------Full Event Deatils-------------------------");
		for(var ev : eventList.entrySet()) {
			System.out.println("------------Event "+(i)+" ------------------");
			System.out.println("Event Id: "+ev.getKey());
			System.out.println("Event Name: "+ev.getValue().getEventName());
			System.out.println("Event Data: "+ev.getValue().getDate());
			System.out.println("Location: "+ev.getValue().getLocation());
			System.out.println("Total Attendees: "+ev.getValue().getAttendees());
			System.out.println("----------------------------------");
			i+=1;
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	//view event by id
	public void viewEventByID(int id) {
		for(var event : eventList.entrySet()) {
			if(event.getKey()==id) {
				System.out.println("--------------Event Details--------------");
				System.out.println("Event Name: "+event.getValue().getEventName());
				System.out.println("Event Data: "+event.getValue().getDate());
				System.out.println("Location: "+event.getValue().getLocation());
				System.out.println("Total Attendees: "+event.getValue().getAttendees());
				System.out.println("------------------------------------------");
				return;
			}
		}
		System.out.println("Event not found with id "+id);
	}
	
	//this method generate the random id for event
	public int generateId() {
		Random random = new Random();
		return random.nextInt(10000);
	}
}
