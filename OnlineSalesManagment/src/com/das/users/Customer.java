package com.das.users;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.das.sales.order.OnlinePayment;
import com.das.sales.order.Payment;
@Entity
public class Customer extends User {

	private String firstName,lastName;
	private Date customerScience;
	@ElementCollection
	private Set<Address> shippingAddress=new HashSet<Address>();
	@ElementCollection
	private Set<Address> billingAddress=new HashSet<Address>();
	@OneToMany
	private Set<Payment> paymentMethod=new HashSet<Payment>();

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the customerScience
	 */
	public Date getCustomerScience() {
		return customerScience;
	}
	/**
	 * @param customerScience the customerScience to set
	 */
	public void setCustomerScience(Date customerScience) {
		this.customerScience = customerScience;
	}
/*	*//**
	 * @return the supplierContactDetail
	 *//*
	public Set<ContactDetail> getSupplierContactDetail() {
		return supplierContactDetail;
	}
	*//**
	 * @param supplierContactDetail the supplierContactDetail to set
	 *//*
	public void setSupplierContactDetail(Set<ContactDetail> supplierContactDetail) {
		this.supplierContactDetail = supplierContactDetail;
	}*/
	/**
	 * @return the shippingAddress
	 */
	public Set<Address> getShippingAddress() {
		return shippingAddress;
	}
	/**
	 * @param shippingAddress the shippingAddress to set
	 */
	public void setShippingAddress(Set<Address> shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	/**
	 * @return the billingAddress
	 */
	public Set<Address> getBillingAddress() {
		return billingAddress;
	}
	/**
	 * @param billingAddress the billingAddress to set
	 */
	public void setBillingAddress(Set<Address> billingAddress) {
		this.billingAddress = billingAddress;
	}
	/**
	 * @return the paymentMethod
	 */
	public Set<Payment> getPaymentMethod() {
		return paymentMethod;
	}
	/**
	 * @param paymentMethod the paymentMethod to set
	 */
	public void setPaymentMethod(Set<Payment> paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	}
	

