package com.collections;
import java.util.*;

public class ReverseQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(5);
		q.add(4);
		q.add(3);
		q.add(2);
		q.add(1);
		
		ArrayList<Integer> list = new ArrayList<>(q);
		Collections.reverse(list);

		q.clear();
		
		q.addAll(list);
		for(int num : q) {
			System.out.print(num+" ");
		}
	}
}
