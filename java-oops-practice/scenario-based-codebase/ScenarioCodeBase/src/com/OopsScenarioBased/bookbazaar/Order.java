package com.OopsScenarioBased.bookbazaar;
import java.util.*;

public class Order implements IDiscountable {
	
	
	static Map<Integer,ArrayList<Book>> userBook = new HashMap<>();	
	
	//this method borrow book
	 public void borrowBook(int userID,int bookId, int quantity) {
		 for(Book books:BookOwner.bookList) {
			 if(books.getBookID()==bookId) {
				 //we got book id
				 if(books.getStock()>=quantity && quantity>0) {
					 int currentQuantity = books.getStock();
					 System.out.println("Book borrowed success");
					 if(userBook.get(userID)!=null) {
						 books.setStockTemp(quantity);
						 ArrayList<Book> newBook = userBook.get(userID);
						 newBook.add(books);
						 userBook.put(userID, newBook);
						 books.setStockTemp(currentQuantity-quantity);
					 }else {
						 books.setStockTemp(quantity);
						 ArrayList<Book> cur = new ArrayList<>(); 
						 cur.add(books);
						 userBook.put(userID, cur);
						 books.setStockTemp(currentQuantity-quantity);
					 }
					 return;
				 }else {
					 System.out.println("Enter correct quantity pleas!");
				 }
			 }
		 }
		 System.out.println("sorry! booked id not found!");
	 }
	
	//this method return book
//	 public void returnBook(int userID, int bookId, int quantity) {
//		 for(var books:userBook.entrySet()) {
//			 if(books.getKey()==userID) {
//				 if(books.getValue().getStock()>=quantity && quantity>0) {
//					 books.getValue().updateStock(quantity);
//					 if(books.getValue().getStock()==0) {
//						 userBook.remove(userID);
//						 System.out.println("You return all book!");
//						 return;
//					 }
//					 System.out.println("book return done!");
//				 }
//				 else {
//					 System.out.println("Please enter correct quantity!");
//					 return;
//				 }
//				 boolean f2 = false;
//				 System.out.println("Book return!");
//				 for(var user: userList.entrySet()) {
//					 if(user.getKey()==bookId) {
//						 userList.remove(bookId);
//						 f2 = true;
//						 System.out.println("User book return status updated!");
//						 break;
//					 }
//				 }
//				 if(f2) {
//					 break;
//				 }
//			 }
//		 }
//		 System.out.println("sorry! booked id not found!");
//	 }
	
	//this method calculate the price -> price × quantity – discount.
	
	//this method work for discount
//	@Override
	public void applyDiscount() {
		System.out.println("hello");
	}
}
