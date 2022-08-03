package com.zensar.bean;

public class BgradeSalaryCalculator implements SalaryCalculator {

	@Override
	public double computeAllowance(double basic) {
		// TODO Auto-generated method stub
		double allow=basic*0.10;
		return allow;
	}
	

}
