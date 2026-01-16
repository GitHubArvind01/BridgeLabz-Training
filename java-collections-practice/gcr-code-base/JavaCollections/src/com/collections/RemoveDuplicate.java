package com.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(2);
		List<Integer> result = new ArrayList<>();
		
		System.out.println("Before remove duplicate-");
		display(list);
		System.out.println("After remove duplicate -");
		for(Integer num : list) {
			if(!result.contains(num)) {
				result.add(num);
			}
		}
		display(result);
	}
	public static void display(List<Integer> list) {
		for(Integer l : list) {
			System.out.print(l+" ");
		}
		System.out.println();
	}
}
