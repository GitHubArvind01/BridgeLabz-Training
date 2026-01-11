package com.question.browserbuddy;

public class Main {

	public static void main(String[] args) {
		DoubleLinkedList node1 = new DoubleLinkedList();
		node1.addTab(new Tab("hello"));
		node1.addTab(new Tab("how"));
		node1.addTab(new Tab("are you?"));
		
		node1.viewTabs();
		
		node1.backwardTab();
		node1.backwardTab();
		node1.backwardTab();
		
		node1.viewTabs();
		
		node1.closeTabs();
		
		node1.viewTabs();
		
		node1.reopenTabs();
		
		node1.viewTabs();
	}
}