package com.collections;
import java.util.*;

public class GenerateBinaryNumbers {

	public static void main(String[] args) {
		Queue<String> q	= new LinkedList<>();
		
		int n = 7;
		for(int i=1;i<=n;i++) {
			String binary = Integer.toBinaryString(i);
			q.add(binary);
		}
		
		for(String s: q) {
			System.out.print(s+ " ");
		}
	}
}