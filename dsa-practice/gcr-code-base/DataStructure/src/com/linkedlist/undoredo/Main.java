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
		
<<<<<<< HEAD
		t.redo(); 
=======
>>>>>>> c0eac75b1c5abb34fd9c28cc9c74c50b98e52cbf
		t.redo();
		t.currentText();
		
		t.addText("surya");
		t.currentText();
		
	}
}
