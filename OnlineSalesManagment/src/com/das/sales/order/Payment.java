package com.das.sales.order;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import com.das.users.Address;

@Entity
public class Payment implements IPayment 
{
@Id@GeneratedValue(strategy=GenerationType.AUTO)
private int paymentId;
private float paymentAmount;
private boolean isProcessed;
@ElementCollection
private Set<Address> userAddress=new HashSet<Address>();
/**
 * @return the paymentId
 */
public int getPaymentId() {
	return paymentId;
}
/**
 * @param paymentId the paymentId to set
 */
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
/**
 * @return the paymentAmount
 */
public float getPaymentAmount() {
	return paymentAmount;
}
/**
 * @param paymentAmount the paymentAmount to set
 */
public void setPaymentAmount(float paymentAmount) {
	this.paymentAmount = paymentAmount;
}
/**
 * @return the isProcessed
 */
public boolean isProcessed() {
	return isProcessed;
}
/**
 * @param isProcessed the isProcessed to set
 */
public void setProcessed(boolean isProcessed) {
	this.isProcessed = isProcessed;
}
/**
 * @return the userAddress
 */
public Set<Address> getUserAddress() {
	return userAddress;
}
/**
 * @param userAddress the userAddress to set
 */
public void setUserAddress(Set<Address> userAddress) {
	this.userAddress = userAddress;
}
}
