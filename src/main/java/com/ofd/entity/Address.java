package com.ofd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


import org.hibernate.validator.constraints.Length;
@Entity
@Table(name="Address_Tb")

public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Min(value=1)
	@Max(value=1000000)
    
	@Column(name="address_Id")
	private int addressId;
	
    
	@NotNull(message="building name should not be null")
	@Length(min=5,max=20,
	message="length should be minimum 5 and maximum 20 characters")

	private String buildingName;
	
	@NotNull(message= "streetno should not be null!!!")
	
	private String streetNo;
	
	@NotNull(message= "area should not be null!!!")
	
	
	private String area;
	@NotNull(message= "city should not be null!!!")
	
	
	private String city;
	@NotNull(message= "state should not be null!!!")
	
	private String state;
	@NotNull(message= "Country should not be null!!!")
	
	
	private String country;
	@NotNull(message="pincode should be mandatory")
	
	private String pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressId, String buildingName, String streetNo, String area, String city, String state,
			String country, String pincode) {
		super();
		this.addressId = addressId;
		this.buildingName = buildingName;
		this.streetNo = streetNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", buildingName=" + buildingName + ", streetNo=" + streetNo
				+ ", area=" + area + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode="
				+ pincode + "]";
	}
	
	


}