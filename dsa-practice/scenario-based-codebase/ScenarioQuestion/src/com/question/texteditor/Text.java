package com.question.texteditor;
import java.util.Stack;

public class Text {
	static Stack<String> data = new Stack<>();
	static Stack<String> restoreData = new Stack<>();
	
	//insert text
	public void insertText(String text) {
		data.push(text);
		restoreData.clear();
		System.out.println("text added");
	}
	
	//delete text
	public void deleteText() {
		if(!data.isEmpty()) {
			restoreData.push(data.pop());
			System.out.println("text deleted.");
		}else {
			System.out.println("text empty!");
		}
	}
	
	//undo operation
	public void undo() {
		if(!restoreData.isEmpty()) {
			data.push(restoreData.pop());
			System.out.println("text undo done.");
		}else {
			System.out.println("undo not possible, text empty!");
		}
	}
	
	//redo
	public void redo() {
		if(!data.isEmpty()) {
			restoreData.push(data.pop());
			System.out.println("text redo done.");
		}else {
			System.out.println("redo not possible, text empty!");
		}
	}
	
	//view text
	public void viewText() {
		for(String s: data) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
