package com.app.plan_enum;

//2. ServicePlans n their charges -
//SILVER : 1000 
//GOLD : 2000
//DIAMOND : 5000
//PLATINUM : 10000


public enum plans {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

	private double planAmt;
	plans(double i) {
		planAmt =i;
	}
	
	@Override
	public String toString() {
		return name()+" : " +this.planAmt;
	}
	
	public double getPlanAmt() {
		return this.planAmt;
	}
}
