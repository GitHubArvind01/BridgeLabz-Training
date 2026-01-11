package com.question.browserbuddy;

import java.util.Stack;

public class DoubleLinkedList {
	Tab head;
	Tab curr; // this will track current tab for forward and backward tab view
	Stack<Tab> tabs = new Stack<>();
	
	//add tab
	public void addTab(Tab newTab) {
		if(head==null) {
			head = curr =newTab;
			System.out.println("Added first node.");
			return;
		}
		
		Tab temp = head;
		while(temp.next!=null) {
			temp = temp.next;
			curr = temp;
		}
		
		temp.next = newTab;
		newTab.pre = temp;
		temp = newTab;
		curr = newTab;
		System.out.println("Added last node");
	}
	
	//view tabs
	public void viewTabs() {
		int i =1;
		Tab temp = head;
		while(temp!=null) {
			System.out.println("\n-----------Tab "+(i)+"------------");
			System.out.println(temp.text);
			System.out.println("----------------------------");
			temp = temp.next;
			i+=1;
		}
	}
	
	//forward
	public void forwardTabs() {
		System.out.println("\n------Forward Current Tab-------");
		if(curr==null) {
			System.out.println("Not forward tab exist");
			return;
		}
		
		if(curr.next!=null) {
			curr = curr.next;
			System.out.println(curr.text);
			System.out.println("--------------------------------");
			return;
		}
		else {
			System.out.println("Not forward tab exist");
		}
		System.out.println("--------------------------------");
	}
	
	//backward
	public void backwardTab() {
		System.out.println("\n------Backward Current Tab------");
		if(curr==null) {
			System.out.println("Not backword tab exist!");
			return;
		}
		if(curr.pre!=null) {
			curr = curr.pre;
			System.out.println(curr.text);
			System.out.println("--------------------------------");
			return;
		}
		else {
			System.out.println("Not backword tab exist");
		}
		System.out.println("--------------------------------");
	}
	
	//close tab
	public void closeTabs() {
		//here we push current tab in stack by deleting node of tabs
		if(curr==null) {
			System.out.println("\n----Tab not exits to close----");
			return;
		}
		if(curr.pre==null) {
			tabs.push(curr);
			head = curr.next;
			curr = head;
			if(curr!=null) {
				curr.pre = null;
			}
			System.out.println("\n---tab closed---");
			return;
		}
		
		Tab closeTab = curr;
		tabs.push(closeTab);
		
		if(closeTab.next!=null) {
			closeTab.next.pre = closeTab.pre;
		}
		if(closeTab.pre!=null) {
			closeTab.pre.next = closeTab.next;
		}
		if(closeTab.next!=null) {
			curr = closeTab.next;
		}else {
			curr = closeTab.pre;
		}
		System.out.println("\nTab closed.");
	}
	
	//reopen 
	public void reopenTabs() {
		if(!tabs.isEmpty()) {
			Tab newTab = tabs.pop();
			newTab.next = null;
			newTab.pre = null;
			addTab(newTab);
			System.out.println("\nRe-opened tabs.");
			return;
		}else {
			System.out.println("\nNo any tabs");
		}
	}
}
