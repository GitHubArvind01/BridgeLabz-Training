package com.linkedlist.undoredo;

public class Main {

	public static void main(String[] args) {
		TextEditor t = new TextEditor();
		t.addText("hello world");
		t.addText("my friends");
		t.addText("hii body");
		t.currentText();
		
		t.undo();
		t.currentText();
		
		t.redo(); 
		t.redo();
		t.currentText();
		
		t.addText("surya");
		t.currentText();
		
	}
}
