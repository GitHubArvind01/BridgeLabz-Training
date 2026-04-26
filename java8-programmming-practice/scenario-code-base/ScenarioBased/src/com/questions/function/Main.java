package com.questions.function;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		/*
			Scenario 2: Function (Data Transformation)
			
			1.Convert student marks into grade (A/B/C) using Function.
			
			2.In payroll system, calculate annual salary from monthly salary.
			
			3.Convert product price into discounted price.
			
			4.Convert employee name into uppercase.
			
			5.Convert Celsius temperature into Fahrenheit.
		 */
		
		
		System.out.println("1.Convert student marks into grade (A/B/C) using Function.");
		int mark = 50;
		if(mark>100) {
			System.out.println("Invalid marks");
			return;
		}
		Function<Integer, Character> marking = a-> {
			if(a>80) {
				return 'A';
			}
			else if(a>50 && a<=80) {
				return 'B';
			}
			else {
				return 'C';
			}
		};
		System.out.println(marking.apply(mark));
		
		
		
		System.out.println("\n2.In payroll system, calculate annual salary from monthly salary.");
		double salary = 49999;
		Function<Double,Double> annual = a-> a*12;
		System.out.println(annual.apply(salary));
		
		
		System.out.println("\n3.Convert product price into discounted price.");
		Function<Double,Double> discount = a-> a*0.10;
		System.out.println(discount.apply(599.9));
		
		
		System.out.println("\n4.Convert employee name into uppercase.");
		Function<String,String> upper = a-> a.toUpperCase();
		System.out.println(upper.apply("allu"));
		
		
		System.out.println("\n5.Convert Celsius temperature into Fahrenheit.");
		Function<Double,Double> f = a-> (a*1.8)+32;
		System.out.println(f.apply(37.1));
	}
}