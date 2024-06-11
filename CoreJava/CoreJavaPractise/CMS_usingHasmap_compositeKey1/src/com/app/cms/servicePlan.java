package com.app.cms;

public enum servicePlan {
	GOLD(2000),SILVER(1000),DIAMOND(5000),PLATINUM(10000);

		private double regtamt;
	servicePlan(double regtamt) {
		this.regtamt=regtamt;
	}
	
	
	public double getRegtamt() {
		return regtamt;
	}
	
	@Override
	public String toString() {
		return this.name()+" : "+this.regtamt;
	}
}
