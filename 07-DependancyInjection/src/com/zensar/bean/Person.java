package com.zensar.bean;

public class Person {
	String name;
	SalaryCalculator agradeBean;
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", basic=" + basic + "]";
	}
	Address address;
	double basic;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public double getAllowance() {
		double allowanceAmt=this.agradeBean.computeAllowance(basic);
		return allowanceAmt;
	}
	public SalaryCalculator getAgradeBean() {
		return agradeBean;
	}
	public void setAgradeBean(SalaryCalculator agradeBean) {
		this.agradeBean = agradeBean;
	}
	
	

}
