package com.question.texteditor;

public class Main {

	public static void main(String[] args) {
		Text text = new Text();
		
		text.insertText("Hii");
		text.insertText("hello");
		text.insertText("how");
		text.insertText("are");
		text.insertText("you?");
		
		text.viewText();
		
		text.deleteText();
		text.viewText();
		
		text.undo();
		text.viewText();
		
		text.redo();
		text.viewText();
		
		text.undo();
		text.viewText();		
	}
}
