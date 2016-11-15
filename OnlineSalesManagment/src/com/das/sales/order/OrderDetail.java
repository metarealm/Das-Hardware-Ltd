package com.das.sales.order;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderDetail {
	@Id
	private int orderId;
	private int productId,orderNumber,orderDetailId;
	private float price,quantity,discont,total,size;
	private Date shipDate,billDate;
	private boolean fulfiled;
	private String color;
	private String idsku;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public float getDiscont() {
		return discont;
	}
	public void setDiscont(float discont) {
		this.discont = discont;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public Date getShipDate() {
		return shipDate;
	}
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public boolean isFulfiled() {
		return fulfiled;
	}
	public void setFulfiled(boolean fulfiled) {
		this.fulfiled = fulfiled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getIdsku() {
		return idsku;
	}
	public void setIdsku(String idsku) {
		this.idsku = idsku;
	}
}