package com.collections;
import java.util.*;

import java.util.HashSet;

public class FindSubsets {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		set1.add(13);
		set1.add(1);
		set1.add(0);
		set1.add(4);
		set1.add(5);
		set1.add(4);
		set1.add(9);
		
		ArrayList<Integer> list = new ArrayList<>(set1);
				
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(0);
		set2.add(4);
		
		for(int i=0;i<list.size();i++) {
			HashSet<Integer> newSet = new HashSet<>();
			for(int j=i;j<list.size();j++) {
				newSet.add(list.get(j));
				if(set2.equals(newSet)) {
					System.out.println("Subset find success.");
					return;
				}
			}
			if(set2.equals(newSet)) {
				System.out.println("Subset find success.");
				return;
			}
			newSet.clear();
		}
		System.out.println("Subset not found.");
	}
}