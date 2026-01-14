package com.OopsScenarioBased.budgetwise;
import java.util.*;

public class Budget {
	enum Category {
	    FOOD,
	    RENT,
	    TRANSPORT,
	    SHOPPING,
	    ENTERTAINMENT,
	    UTILITIES
	}
	
	private double income;
	private double limit;
	Map<Category, Double> categoryLimits;
	
	public Budget(double income, double limit, Map<Category, Double> categoryLimits) {
		this.income = income;
		this.limit = limit;
		this.categoryLimits = categoryLimits;
	}

	public double getIncome() {
		return income;
	}

	public double getLimit() {
		return limit;
	}
}
