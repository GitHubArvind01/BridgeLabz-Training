package com.collections;
import java.util.*;

public class SortSet {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(13);
		set1.add(1);
		set1.add(0);
		set1.add(4);
		set1.add(5);
		set1.add(4);
		set1.add(9);

		
		ArrayList<Integer> list = new ArrayList<>(set1);
		Collections.sort(list);
		
		set1.clear();
		
		HashSet<Integer> set2 = new HashSet<>(list);
		
		for(int num : set2) {
			System.out.print(num+ " ");
		}
	}
}
