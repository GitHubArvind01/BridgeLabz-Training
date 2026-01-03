package com.encapsulation.librarysystem;

public class Main {
	public static void main(String args[]) {
		LibraryItem lb1 = new Book(101,"Automic habit","James Clear");
		lb1.getItemDetails();
        System.out.println("Loan Duration: " + lb1.getLoanDuration() + " days");
        Reservable r = (Reservable) lb1;
        r.checkAvailability();
        r.reserveItem("Arvind");
        
		LibraryItem lb2 = new Magazine(2, "Tech Monthly", "Editor");
		lb2.getItemDetails();
        System.out.println("Loan Duration: " + lb2.getLoanDuration() + " days");
        Reservable r2 = (Reservable) lb2;
        r2.checkAvailability();
        r2.reserveItem("ramu");
		
		LibraryItem lb3 = new DVD(3, "OOPS Concepts", "Trainer");
		lb3.getItemDetails();
        System.out.println("Loan Duration: " + lb3.getLoanDuration() + " days");
        Reservable r3 = (Reservable) lb3;
        r3.checkAvailability();
        r3.reserveItem("kali");
	}
}
