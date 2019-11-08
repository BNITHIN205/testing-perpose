package com.example.springdemo.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "employee_details_t")
public class EmployeeDetailsT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="name")
	private String name;

	@Column(name="gender")
	private String gender;

	@Column(name="age")
	private int age;
	@Column(name="status")
	private int status;
	@OneToMany(cascade={CascadeType.ALL})
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name="id", referencedColumnName="id")
//	@JsonManagedReference
    private Set<EmployeeAddressT> address;

	public EmployeeDetailsT() {
	}

	

	public EmployeeDetailsT(int id, String name, String gender, int age, int status, Set<EmployeeAddressT> address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.status = status;
		this.address = address;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	/**
	 * @return the address
	 */
	public Set<EmployeeAddressT> getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Set<EmployeeAddressT> address) {
		this.address = address;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/*@Override
	public String toString() {
		return "EmployeeDetailsT [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", status="
				+ status + ", address=" + address + "]";
	}*/



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result =String.format("EmployeeDetailsT [id=%d, name='%s', gender='%s', age=%d, status=%d]%n", id,name,gender,age,status);
		if (address != null) {
            for(EmployeeAddressT addressT : address) {
                result += String.format(
                        "EmployeeAddressT[addressId=%d, houseNo='%s',cityName='%s',stateName='%s',countryName='%s']%n",
                        addressT.getAddressId(), addressT.getHouseNo(),addressT.getCityName(),addressT.getStateName(),addressT.getCountryName());
            }
        }
		return result;
	}
	
	

	


}
