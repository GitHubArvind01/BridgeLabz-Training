package com.linkedlist.moviesystem;

public class Main {

	public static void main(String[] args) {
		DoubleLinkedList d = new DoubleLinkedList();
		d.addAtBeginnig("RRR", "SSS Raja mauli",2023, 5.5f);
		d.addAtBeginnig("3 idiot", "XXX",2017, 8.5f);
		
		d.searchMovie("SSS Raja mauli", 5.5f);
		
		d.displayAllMoive();
		
		d.updateRating("RRR",8.9f);
		d.displayAllMoive();
		
		d.removeMoive("RRR");
	}
}
