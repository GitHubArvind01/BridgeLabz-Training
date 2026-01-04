package com.linkedlist.undoredo;

public class TextEditor {
	private Text current;
	private Text tail;
	private Text head;
	
	private int size;
	
	private final int max_size = 10;
	
	//add the text state
	public void addText(String t) {
		Text newText = new Text(t);
		
		//this will work to Re-do if the 
		if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }
		
		if(head==null) {
			head = tail = newText;
			return;
		}
		
		tail.next = newText;
		newText.prev = tail;
		tail = newText;
		current = newText;
		size+=1;
		
		if(size>max_size) {
			head = head.next;
			head.prev = null;
			size--;
		}
	}
	
	//undo
	public void undo() {
		if(current==null || current.next==null) {
			System.out.println("Nothing have to undo!");
			return;
		}
		
		current = current.prev;
	}
	
	//re-do
	public void redo() {
		if(current==null || current.next==null) {
			System.out.println("Nothing have to redo!");
			return;
		}
		current = current.next;
	}
	
	//current text
	public void currentText() {
		if(current==null) {
			System.out.println("Editor empty!");
			return;
		}
		System.out.println("Current text : \n"+current.content);
	}
}
