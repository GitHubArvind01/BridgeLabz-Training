package com.collections;
import java.util.*;

public class TwoSetEqual {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(3);
		set1.add(4);
		
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(3);
		set2.add(4);
		
		if(set1.equals(set2)) {
			System.out.println("Both set are equal");
		}
		else {
			System.out.println("Both set are not equal");
		}
	}
}