package com.example.springdemo.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "employee_address_t")
public class EmployeeAddressT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;
	@Column(name="house_no")
	private String houseNo;
	@Column(name="city_name")
	private String cityName;
	@Column(name="state_name")
	private String stateName;
	@Column(name="country_name")
	private String countryName;
	@ManyToOne
    @JoinColumn(name = "id")
//	@JsonBackReference
    private EmployeeDetailsT employeeDetails;
	
	public EmployeeAddressT() {}

	public EmployeeAddressT(int addressId, String houseNo, String cityName, String stateName, String countryName,
			EmployeeDetailsT employeeDetails) {
		super();
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
		this.employeeDetails = employeeDetails;
	}

	/**
	 * @return the addressId
	 */
	public int getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the houseNo
	 */
	public String getHouseNo() {
		return houseNo;
	}

	/**
	 * @param houseNo the houseNo to set
	 */
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the employeeDetails
	 */
	@JsonIgnore
	public EmployeeDetailsT getEmployeeDetails() {
		return employeeDetails;
	}

	/**
	 * @param employeeDetails the employeeDetails to set
	 */
	public void setEmployeeDetails(EmployeeDetailsT employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeAddressT [addressId=" + addressId + ", houseNo=" + houseNo + ", cityName=" + cityName
				+ ", stateName=" + stateName + ", countryName=" + countryName + ", employeeDetails=" + employeeDetails
				+ "]";
	}

	

}
