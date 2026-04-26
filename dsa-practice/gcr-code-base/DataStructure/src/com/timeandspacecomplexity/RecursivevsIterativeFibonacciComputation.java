package com.timeandspacecomplexity;
import java.util.*;

public class RecursivevsIterativeFibonacciComputation {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		long start_fibonacciRecursive_time = System.nanoTime();
		fibonacciRecursive(n);
		long end_fibonacciRecursive_time = System.nanoTime();
		
		System.out.println("fibonacci Recursive time taken: "+(end_fibonacciRecursive_time-start_fibonacciRecursive_time));
		
		
		long start_fibonacciIterative_time = System.nanoTime();
		fibonacciIterative(n);
		long end_fibonacciIterative_time = System.nanoTime();
		
		System.out.println("Fibonacci Iterative time taken: "+(end_fibonacciIterative_time-start_fibonacciIterative_time));
	}
	
	public static int fibonacciRecursive(int n) {
	    if (n <= 1) return n;
	    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
	
	public static int fibonacciIterative(int n) {
	    int a = 0, b = 1, sum;
	    for (int i = 2; i <= n; i++) {
	        sum = a + b;
	        a = b;
	        b = sum;
	    }
	    return b;
	}
}
