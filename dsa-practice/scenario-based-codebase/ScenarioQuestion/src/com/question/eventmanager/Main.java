package com.question.eventmanager;

public class Main {

	public static void main(String[] args) {
		Event[] events = {new Event("Wedding",23321),new Event("BirthDay",4321),new Event("Party",54544),new Event("Aniversary",32323)};
		quickSort(events,0,events.length-1);
		
		//display
		for(Event e : events) {
			System.out.println("Event Name: "+e.eventName);
			System.out.println("Price: "+e.price+"\n");
		}
	}
	public static void quickSort(Event events[], int start, int end) {
		if(start>=end) {
			return;
		}
		double pivot = events[end].price;
		int j = 0;
		int i = start-1;
		
		while(j<end) {
			if(events[j].price<=pivot) {
				i+=1;
				Event temp = events[i];
				events[i] = events[j];
				events[j] = temp;
			}
			j+=1;
		}
		i+=1;
		Event temp = events[i];
		events[i] = events[j];
		events[j] = temp;
		quickSort(events,i+1,end);
		quickSort(events,start,i-1);
	}
}