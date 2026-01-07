package com.OopsScenarioBased.eventmanagement;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		EventManagement owner = new EventManagement();
		
		//here work start
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("Add Event-> enter 'A' : ");
			System.out.println("Remove Event-> enter 'R': ");
			System.out.println("See Full Event Detils-> enter 'V': ");
			System.out.println("For view Perticular Event-> enter 'T': ");
			System.out.println("For exit quiz -> enter 'E' :");
			System.out.println("--------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			
			switch(c){
				case 'A':
					System.out.println("\n---------------Choose Event--------------");
					System.out.println("Add Wedding Event-> enter 'W' 		: ");
					System.out.println("Add Birthday Event-> enter 'B' 		: ");
					System.out.println("Add Conference Event-> enter 'C'	: ");
					System.out.println("--------------------------------------------");
					
					char addOption = sc.next().charAt(0);
					addOption = Character.toUpperCase(addOption);
					
					if(addOption!='W' && addOption!='B' && addOption!='C') {
						System.out.println("Invalid! Please chose correct event option.");
						break;
					}
					else{
						System.out.println("Enter the Event location: ");
						String eventLocation = sc.nextLine();
						sc.nextLine();
						
						System.out.println("Enter the event data: ");
						String eventDate = sc.next();
						sc.nextLine();
						
						System.out.println("Enter the number of attendees: ");
						int attendees = sc.nextInt();
						
						if(addOption=='W') {
							Event e1 = new WeddingEvent(eventLocation,eventDate,attendees);
							owner.addEvent(e1);
							break;
						}
						if(addOption=='B') {
							Event e2 = new BirthdayEvent(eventLocation,eventDate,attendees);
							owner.addEvent(e2);
							break;
						}
						if(addOption=='C') {
							Event e3 = new ConferenceEvent(eventLocation,eventDate,attendees);
							owner.addEvent(e3);
							break;
						}
					}
					break;
				case 'R':
					System.out.println("\n---------------Choose Event--------------");
					System.out.println("Remove Wedding Event-> enter 'W' 		: ");
					System.out.println("Remove Birthday Event-> enter 'B' 		: ");
					System.out.println("Remove Conference Event-> enter 'C'		: ");
					System.out.println("--------------------------------------------");
					char removeOption = sc.next().charAt(0);
					removeOption = Character.toUpperCase(removeOption);
					
					if(removeOption!='W' && removeOption!='B' && removeOption!='C') {
						System.out.println("Invalid! Please chose correct event option.");
						break;
					}else {
						System.out.println("Enter the Event id to remove: ");
						int eventID = sc.nextInt();
						owner.removeEvent(eventID);
					}
					break;
				case 'V':
					owner.viewEvent();
					break;
				case 'T':
					System.out.println("Enter the Event id to remove: ");
					int oneId = sc.nextInt();
					owner.viewEventByID(oneId);
					break;
				default:
					System.out.println("Invalid input!");
			}
		}		
	}
}
