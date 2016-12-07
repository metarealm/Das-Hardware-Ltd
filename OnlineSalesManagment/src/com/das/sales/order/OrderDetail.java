package com.das.sales.order;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.das.Product;
import com.das.transactions.Discount;

@Entity
public class OrderDetail { 
@Id@GeneratedValue(strategy=GenerationType.AUTO)
private int orderDetailId;
private float price,quantity,total,size;
private String color;
private boolean fulfilled;
private Date shipDate,billDate;
@ElementCollection
private Set<Discount>discount=new HashSet<Discount>();
@ManyToMany
private Collection<Orders>order=new ArrayList<Orders>();
@ManyToMany
private Collection<Product>product=new ArrayList<Product>();
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
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public boolean isFulfilled() {
	return fulfilled;
}
public void setFulfilled(boolean fulfilled) {
	this.fulfilled = fulfilled;
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
public Set<Discount> getDiscount() {
	return discount;
}
public void setDiscount(Set<Discount> discount) {
	this.discount = discount;
}
public Collection<Orders> getOrder() {
	return order;
}
public void setOrders(Collection<Orders> order) {
	this.order = order;
}
public Collection<Product> getProduct() {
	return product;
}
public void setProduct(Collection<Product> product) {
	this.product = product;
}
}