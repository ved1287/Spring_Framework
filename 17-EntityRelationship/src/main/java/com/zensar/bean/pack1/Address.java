package com.zensar.bean.pack1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
@Entity
public class Address {
	@Id
	int addressId;
	@Column
    String rollNo;
	@Column
    String areaName;
	@Column
    String cityName;
    @OneToOne
	@MapsId
	@JoinColumn(name="empId")
    Employee employee;
	public Address( String rollNo, String areaName, String cityName, Employee employee) {
		super();
		this.rollNo = rollNo;
		this.areaName = areaName;
		this.cityName = cityName;
		this.employee = employee;
	}
	public Address() {
		super();
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", rollNo=" + rollNo + ", areaName=" + areaName + ", cityName="
				+ cityName + "]";
	}
	
    
}
