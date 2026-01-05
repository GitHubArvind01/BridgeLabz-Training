package com.stackqueue.implementqueue;

public class Queue {
	StackWork s1 = new StackWork();
	StackWork s2 = new StackWork();
	
	
	//enqueue
	public void enqueue(int data) {
		s1.push(new Stack(data));
	}
	//dequeue
	public void dequeue() {
		if(s1.isEmpty() && s2.isEmpty()) {
			System.out.println("Queue is empty!");
			return;
		}
		
		if(s2.isEmpty()) {
			while(s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		System.out.println("Deletd: "+s1.pop().data);
	}
}
