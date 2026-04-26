package com.collections;
import java.util.*;

public class SymmetricDifference {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		HashSet<Integer> newSet = new HashSet<>();
		
		for(int set : set1) {
			if(!newSet.contains(set)) {
				newSet.add(set);
			}
		}
		
		for(int set : set2) {
			if(!newSet.contains(set)) {
				newSet.add(set);
			}
			else {
				newSet.remove(set);
			}
		}
		
		for(int num : newSet) {
			System.out.println(num+" ");
		}
	}
}
