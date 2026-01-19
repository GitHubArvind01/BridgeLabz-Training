package com.collections;

import java.util.HashMap;
import java.util.Map;

public class FindKeyOfMaxVal {

	public static void main(String[] args) {
		Map<Integer,Integer> map1 = new HashMap<>();
		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(3, 300);
		map1.put(10, 1000);
		map1.put(20, 2000);
		map1.put(30, 3000);
		
		int key = Integer.MAX_VALUE;
		int val = Integer.MIN_VALUE;
		
		for(var v : map1.entrySet()) {
			if(v.getValue()>val) {
				key = v.getKey();
				val = v.getValue();
			}
		}
		
		System.out.println("Max Value key is: "+key+" and their value is : "+val);
	}
}