package com.collections.implementstack;
import java.util.*;

public class Stacks {
	Queue<Integer> stack = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	public void push(int data) {
		while(!stack.isEmpty()) {
			q2.add(stack.poll());
		}
		
		stack.add(data);
		
		while(!q2.isEmpty()) {
			stack.add(q2.poll());
		}
	}
	
	public void pop() {
		if(stack.isEmpty()) {
			System.out.println("Sorry stack is empty. can't pop");
			return;
		}
		System.out.println(stack.poll());
	}
	
	public void peek() {
		if(stack.isEmpty()) {
			System.out.println("Sorry stack is empty. can't peek");
			return;
		}
		System.out.println(stack.peek());
	}
	
	public void view() {
		if(stack.isEmpty()) {
			System.out.println("Sorry stack is empty. can't view");
			return;
		}
		System.out.println(stack.toString());
	}
}
