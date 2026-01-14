package com.OopsScenarioBased.budgetwise;

import java.util.Map;

public class MonthlyBudget extends Budget{

	public MonthlyBudget(double income, double limit, Map<Category, Double> categoryLimits) {
		super(income, limit, categoryLimits);
	}

}
