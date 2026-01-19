package com.OopsScenarioBased.bagballorganizer;

public class Bag {
	static int count = 101;
	private int bagId;
	private String bagColor;
	private int bagCapacity;
	
	public Bag(String bagColor, int bagCapacity) {
		this.bagId = count++;
		this.bagColor = bagColor;
		this.bagCapacity = bagCapacity;
	}
	
	final int orignalCapacity = bagCapacity;
	
	public int getBagId() {
		return bagId;
	}

	public String getBagColor() {
		return bagColor;
	}

	public int getOrignalBagCapacity() {
		return orignalCapacity;
	}
	
	public int setBagCapacity() {
		return bagCapacity;
	}
	
	public void setBagCapacity(int cap) {
		this.bagCapacity = cap;
	}
}
