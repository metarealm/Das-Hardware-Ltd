package com.das.sales.order;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Orders implements IOrder {
	    @Id
		private int orderId;
		private int orderNumber,paymentId,shipperId;
		private String timeStamp,errLoc,errMsg;
		private Date orderDate,shipDate,requiredDate,paymentDate; 
		private float freight,salesTax,paidamt;
		public boolean transactStatus,fulfiled,deleted;
		
		public boolean getTransactStatus()
		{
			return transactStatus;
		}
		public void setTransactStatus(boolean transactStatus)
		{
			this.transactStatus= transactStatus;
		}
		public boolean getFulfiled()
		{
			return fulfiled;
		}
		public void setFulfiled(boolean fulfiled)
		{
			this.fulfiled= fulfiled;
		}
		public boolean getDeleted()
		{
			return deleted;
		}
		public void setDeleted(boolean deleted)
		{
			this.deleted= deleted;
		}
		
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public void setOrderNumber(int orderNumber) {
			this.orderNumber = orderNumber;
		}
		public int getOrderNumber() {
			return orderNumber;
		}
		public int getPaymentId() {
			return paymentId;
		}
		public void setPaymentId(int paymentId) {
			this.paymentId = paymentId;
		}
		public int getShipperId() {
			return shipperId;
		}
		public void setShipperId(int shipperId) {
			this.shipperId = shipperId;
		}
		public Date getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}
		public Date getShipDate() {
			return shipDate;
		}
		public void setShipDate(Date shipDate) {
			this.shipDate = shipDate;
		}
		public Date getRequiredDate() {
			return requiredDate;
		}
		public void setRequiredDate(Date requiredDate) {
			this.requiredDate = requiredDate;
		}
		public String getTimeStamp() {
			return timeStamp;
		}
		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
		public String getErrLoc() {
			return errLoc;
		}
		public void setErrLoc(String errLoc) {
			this.errLoc = errLoc;
		}
		public String getErrMsg() {
			return errMsg;
		}
		public void setErrMsg(String errMsg) {
			this.errMsg = errMsg;
		}
		public Date getPaymentDate() {
			return paymentDate;
		}
		public void setPaymentDate(Date paymentDate) {
			this.paymentDate = paymentDate;
		}
		public float getFreight() {
			return freight;
		}
		public void setFreight(float freight) {
			this.freight = freight;
		}
		public float getSalesTax() {
			return salesTax;
		}
		public void setSalesTax(float salesTax) {
			this.salesTax = salesTax;
		}
		public float getPaid() {
			return paidamt;
		}
		public void setPaid(float paid) {
			this.paidamt = paid;
		}
	}


