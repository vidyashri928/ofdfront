package com.ofd.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@Entity
@Table(name="Customer_Tb")

public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull(message=" CustomerId  should not be null")
	@Min(value=1)
	@Max(value=1000000)
   @Column(name="customer_Id")
	private int customerId;
	
	@NotNull(message= "firstName should not be null!!!")
	@Pattern(regexp= "^[A-Za-z]+$", message = "First name can only contain alphabets!!!!")
	private String firstName;
	
	@NotNull(message= "lastName should not be null!!!")
	@Pattern(regexp= "^[A-Za-z]+$", message = "Last name can only contain alphabets!!!!")
	
	private String lastName;
	
	@NotNull(message= "age should not be null!!!")
	@Min(value=10)
	@Max(value=200)
	private int age;
	
	@NotNull(message= "gender should not be null!!!")
	
	
	private String gender;
	
	@NotNull(message= "mobileno should not be null!!!")
	@Pattern(regexp= "^[0-9]{1}[0-9]{9}")
	private String mobileNumber;
	
	
	
	@OneToOne
	@JoinColumn(name="Customer_address")
	private Address address;
	
	@NotNull(message= "email should not be null!!!")
	@Email(regexp= "^[a-zA-Z0-9+.-]+@[a-zA-Z0-9+.-]+$")
	private String email;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String firstName, String lastName, int age, String gender, String mobileNumber,
			Address address, String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.email = email;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", address=" + address + ", email="
				+ email + "]";
	}
   
}

