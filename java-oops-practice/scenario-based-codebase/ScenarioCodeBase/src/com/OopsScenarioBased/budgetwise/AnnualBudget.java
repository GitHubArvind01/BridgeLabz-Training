package com.OopsScenarioBased.budgetwise;

import java.util.Map;

public class AnnualBudget extends Budget{

	public AnnualBudget(double income, double limit, Map<Category, Double> categoryLimits) {
		super(income, limit, categoryLimits);
	}

}
