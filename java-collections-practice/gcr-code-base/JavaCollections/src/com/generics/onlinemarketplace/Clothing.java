package com.generics.onlinemarketplace;

enum ClothingCategory {
    MEN, WOMEN, KIDS
}

public class Clothing extends Product<ClothingCategory>{

	public Clothing(String name, double price, ClothingCategory category) {
		super(name, price, category);
	}

}
