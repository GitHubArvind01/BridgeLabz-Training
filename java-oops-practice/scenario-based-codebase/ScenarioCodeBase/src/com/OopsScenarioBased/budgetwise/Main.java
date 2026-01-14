package com.OopsScenarioBased.budgetwise;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//monthly budget
		Map<Budget.Category, Double> monthlyLimits = new HashMap<>();
		monthlyLimits.put(Budget.Category.FOOD, 4000.0);
		monthlyLimits.put(Budget.Category.RENT, 8000.0);
		monthlyLimits.put(Budget.Category.TRANSPORT, 2000.0);
		monthlyLimits.put(Budget.Category.SHOPPING, 3000.0);
		
		Budget monthly = new MonthlyBudget(20000,10000,monthlyLimits);
		
		
		//annual budget
		Map<Budget.Category, Double> annualLimits = new HashMap<>();
		monthlyLimits.put(Budget.Category.FOOD, 4000.0);
		monthlyLimits.put(Budget.Category.RENT, 8000.0);
		monthlyLimits.put(Budget.Category.TRANSPORT, 2000.0);
		monthlyLimits.put(Budget.Category.SHOPPING, 3000.0);
		
		Budget annual = new AnnualBudget(500000,120000,annualLimits);
		
	}
}
