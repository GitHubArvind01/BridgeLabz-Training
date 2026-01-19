package com.collections;
import java.util.*;

public class MergeTwoMap {

	public static void main(String[] args) {
		Map<Integer,Integer> map1 = new HashMap<>();
		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(3, 300);
		
		Map<Integer,Integer> map2 = new HashMap<>();
		map2.put(10, 1000);
		map2.put(20, 2000);
		map2.put(30, 3000);
		
		for(var v : map2.entrySet()) {
			map1.put(v.getKey(), v.getValue());
		}
		
		for(var v : map1.entrySet()) {
			System.out.println(v.getKey()+"-> "+v.getValue());
		}
	}
}
