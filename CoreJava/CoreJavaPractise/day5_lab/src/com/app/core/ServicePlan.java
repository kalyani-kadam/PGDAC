package com.app.core;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATUNUM(10000);

	// add plan cost as a data member
	private double planCost;

	private ServicePlan(double cost) {
		this.planCost = cost;
	}
	//getter

	public double getPlanCost() {
		return planCost;
	}
	
}
