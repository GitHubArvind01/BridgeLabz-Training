package com.generics.onlinemarketplace;

public class Product<T> {
	String name;
    double price;
    T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setPrice(double price) {
    	this.price = price;
    }  
}
