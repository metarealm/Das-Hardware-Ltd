package com.das.users;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Customer extends User {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	private String firstName,lastName,userName,password;
	private Date dateEntered;
	@ElementCollection
	private Set<Address> userAddress=new HashSet<Address>();
	@ElementCollection
	private Set<Address> shippingAddress=new HashSet<Address>();
	@ElementCollection
	private Set<Address> billingAddress=new HashSet<Address>();
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Address> getUserAddress() {
		return UserAddress;
	}
	public void setUserAddress(Set<Address> userAddress) {
		UserAddress = userAddress;
	}
	public Set<Address> getShippingAddress() {
		return ShippingAddress;
	}
	public void setShippingAddress(Set<Address> shippingAddress) {
		ShippingAddress = shippingAddress;
	}

	public Set<Payment> getUserPayment() {
		return UserPayment;
	}
	public void setUserPayment(Set<Payment> userPayment) {
		UserPayment = userPayment;
	}
	public Date getDateEntered() {
		return dateEntered;
	}
	public void setDateEntered(Date dateEntered) {
		this.dateEntered = dateEntered;
	}
	}
	

