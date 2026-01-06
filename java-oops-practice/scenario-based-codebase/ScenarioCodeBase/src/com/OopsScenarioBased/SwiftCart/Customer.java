package com.OopsScenarioBased.SwiftCart;

public class Customer {
	Cart cart;
	
	Customer(Cart cart){
		this.cart = cart;
	}
	
	//add cart
	public void addCarts(int id) {
		cart.addCart(id);
	}
	
	//remove cart
	public void removeCarts(int id) {
		cart.removeCart(id);
	}
	
	//view carts
	public void viewCarts() {
		cart.viewCartProducts();
	}
	
	//generate bills
	public void generateBills() {
		cart.generateBill();
	}
	
}
