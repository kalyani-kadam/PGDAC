package com.app.pojos;
import javax.persistence.*;

@Entity
@Table(name="address")
public class Address extends BaseEntity {
	@Column(length = 50)
	private String street;
	@Column(length = 20)
	private String city;
	@Column(length = 30)
	private String state;
	@Column(length = 30)
	private String country;
	@Column(length = 10,name="zip_code")
	private String zipCode;
	//association mapping property
	//Demo of uni dir association , using shared PK approach	
	@OneToOne//(fetch=FetchType.LAZY)
	@JoinColumn(name="employee_id",nullable = false)
	@MapsId
	private Employee emp;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, String state, String country, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", zipCode=" + zipCode + "]";
	}
	
	
}
