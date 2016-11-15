package com.das.sales.order;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Payment implements IPayment {
	@Id
private int paymentId;
private boolean allowed;
private String paymentType;
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public boolean isAllowed() {
	return allowed;
}
public void setAllowed(boolean allowed) {
	this.allowed = allowed;
}
public String getPaymentType() {
	return paymentType;
}
public void setPaymentType(String paymentType) {
	this.paymentType = paymentType;
}
}
