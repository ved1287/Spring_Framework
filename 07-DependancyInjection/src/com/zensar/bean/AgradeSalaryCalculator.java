package com.zensar.bean;

public class AgradeSalaryCalculator implements SalaryCalculator {
	public double computeAllowance(double basic) {
		double allow=basic*0.40;
		return allow;
	}

}
