package com.collections;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCount {

	public static void main(String[] args) {
		Map<String,Integer> map1 = new HashMap<>();
		
		String arr[] = {"Hello","Hii","Hii","Hi","Hello","Hey","Hello"};
		
		for(int i=0;i<arr.length;i++) {
			map1.put(arr[i], map1.getOrDefault(arr[i], 0)+1);
		}
		
		System.out.println(map1.toString());
	}
}