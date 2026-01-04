package com.linkedlist.undoredo;

public class Text {
	public String content;
	Text prev;
	Text next;
	
	public Text(String content) {
		this.content = content;
		this.prev = null;
		this.next = null;
	}
}
