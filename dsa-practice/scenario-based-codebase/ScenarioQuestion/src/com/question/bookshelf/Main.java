package com.question.bookshelf;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("java","allu",1200);
		
		
		LinkedList node = new LinkedList();
		node.addBook("java","allu",1200);
		node.addBook("mindset","arivnd",1200);
		node.addBook("jefes","suriya",1200);
		node.addBook("now","ravi",200);
		node.addBook("pyhton","ram",1700);
		
		
		node.viewBook();
	}
}
