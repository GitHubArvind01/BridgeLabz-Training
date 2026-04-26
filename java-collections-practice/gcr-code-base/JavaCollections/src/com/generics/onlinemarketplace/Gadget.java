package com.generics.onlinemarketplace;

enum GadgetCategory {
    MOBILE, LAPTOP, ACCESSORY
}

public class Gadget extends Product<GadgetCategory>{

	public Gadget(String name, double price, GadgetCategory category) {
		super(name, price, category);
	}
}
