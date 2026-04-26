package com.stackqueue.implementqueue;

public class StackWork {
	Stack top;
	
	//push
	public void push(Stack s1) {		
		if(top==null) {
			top = s1;
		}
		s1.next = top;
		top = s1;
	}
	
	//pop
	public Stack pop() {
		if(top==null) {
			System.out.println("Stack is empty!");
			return null;
		}
		Stack pop = top;
		top = top.next;
		return pop;
	}
	
	//peek
	public Stack peek() {
		return top;
	}
	
	//isEmpty
	public boolean isEmpty() {
		if(top==null) {
			return true;
		}
		return false;
	}
}
