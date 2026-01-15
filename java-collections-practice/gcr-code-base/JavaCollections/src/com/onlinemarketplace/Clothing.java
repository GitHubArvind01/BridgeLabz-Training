package com.onlinemarketplace;

enum ClothingCategory {
    MEN, WOMEN, KIDS
}

public class Clothing extends Product<ClothingCategory>{

	public Clothing(String name, double price, com.onlinemarketplace.ClothingCategory category) {
		super(name, price, category);
	}

}
