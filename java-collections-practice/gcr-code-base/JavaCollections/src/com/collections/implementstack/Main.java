package com.collections.implementstack;

public class Main {

	public static void main(String[] args) {
		Stacks s = new Stacks();
		s.push(5);
		s.push(44);
		s.push(23);
		s.push(1);
		
		s.peek();
		s.pop();
		
		s.view();
	}
}
