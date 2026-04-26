package com.OopsScenarioBased.bagballorganizer;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Management {
	
	Map<Integer,List<Ball>> bagMapball = new HashMap<>();
	List<Bag> bagsList = new ArrayList<>();
	
	//add bags
	public void addBags(Bag newBags) {
		bagsList.add(newBags);
		System.out.println("\nBag added");
	}
	
	//add balls
	public void addBalls(Ball newBalls, int bagId) {		
		for(Bag b : bagsList) {
			if(b.getBagId()==bagId) {
				if(!bagMapball.containsKey(bagId)) {
					List<Ball> newBall = new ArrayList<>();
					newBall.add(newBalls);
					bagMapball.put(bagId, newBall);
					System.out.println("\nBall added to bag with id: "+bagId);
					return;
				}
				List<Ball> list = bagMapball.get(bagId);
				list.add(newBalls);
				bagMapball.put(bagId, list);
				System.out.println("\nBall added to bag with id: "+bagId);
				return;
			}
		}
		System.out.println("\nBag id not found!");
	}
	
	//remove balls
	public void removeBalls(int bagId) {
		if(!bagMapball.containsKey(bagId)) {
			System.out.println("\nBag id not found.");
			return;
		}
		List<Ball> list = bagMapball.get(bagId);
		list.clear();
		bagMapball.put(bagId, list);
		System.out.println("\nBall removed sucess.");
	}
	
	//display all balls
	public void displayAllBalls() {
		System.out.println("----------------------------------All Balls-----------------------------");
		if(bagMapball.isEmpty()) {
			System.out.println("Bag is empty. there is not balls");
			System.out.println("------------------------------------------------------------------------");
			return;
		}
		for(var b : bagMapball.entrySet()) {
			List<Ball> balls = bagMapball.get(b.getKey());
			if(balls.isEmpty()) {
				System.out.println("For bag with id: "+b.getKey()+" ball list empty!");
			}else {
				System.out.println("\nBag id "+b.getKey()+" ball list-");
				ballDetails(balls);
			}
		}
		System.out.println("------------------------------------------------------------------------");
	}
	
	//bag details
	public void bagDetails(int bagId) {
		for(Bag b : bagsList) {
			System.out.println("Bag Id: "+b.getBagId());
			System.out.println("Bag Color: "+b.getBagColor());
			System.out.println("Bag Capacity: "+b.getOrignalBagCapacity());
		}
	}
	
	//display balls
	public void ballDetails(List<Ball> ballsList) {
		for(Ball b : ballsList) {
			System.out.println("\nBall Id: "+b.getBallId());
			System.out.println("Ball Color: "+b.getBallColor());
			System.out.println("Ball Size: "+b.getBallSize());
		}
	}
}
