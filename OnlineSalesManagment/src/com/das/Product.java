package com.das;

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
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import com.das.sales.order.Orders;
import com.das.transactions.Discount;
import com.das.users.Supplier;

@Entity
public class Product {
@Id@GeneratedValue(strategy=GenerationType.AUTO)
private int productId;
private String productName;
@Lob
private String productDescription;
private int ranking;
private Date discountStartDate,discountEndDate;
private float quantityPerUnit,unitPrice,msrp;
private String availableSizes,availableColors;
private float unitWeight,unitsInStock,unitsOnOrder;
@ElementCollection
private Set<Discount>discount=new HashSet<Discount>();
@ManyToMany(mappedBy="suppliedProducts")
private Collection<Supplier> supliers=new ArrayList<Supplier>();
@ManyToMany
private Collection<Orders>currentOrders=new ArrayList<Orders>();
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public int getRanking() {
	return ranking;
}
public void setRanking(int ranking) {
	this.ranking = ranking;
}
public Date getDiscountStartDate() {
	return discountStartDate;
}
public void setDiscountStartDate(Date discountStartDate) {
	this.discountStartDate = discountStartDate;
}
public Date getDiscountEndDate() {
	return discountEndDate;
}
public void setDiscountEndDate(Date discountEndDate) {
	this.discountEndDate = discountEndDate;
}
public float getQuantityPerUnit() {
	return quantityPerUnit;
}
public void setQuantityPerUnit(float quantityPerUnit) {
	this.quantityPerUnit = quantityPerUnit;
}
public float getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(float unitPrice) {
	this.unitPrice = unitPrice;
}
public float getMsrp() {
	return msrp;
}
public void setMsrp(float msrp) {
	this.msrp = msrp;
}
public String getAvailableSizes() {
	return availableSizes;
}
public void setAvailableSizes(String availableSizes) {
	this.availableSizes = availableSizes;
}
public String getAvailableColors() {
	return availableColors;
}
public void setAvailableColors(String availableColors) {
	this.availableColors = availableColors;
}
public float getUnitWeight() {
	return unitWeight;
}
public void setUnitWeight(float unitWeight) {
	this.unitWeight = unitWeight;
}
public float getUnitsInStock() {
	return unitsInStock;
}
public void setUnitsInStock(float unitsInStock) {
	this.unitsInStock = unitsInStock;
}
public float getUnitsOnOrder() {
	return unitsOnOrder;
}
public void setUnitsOnOrder(float unitsOnOrder) {
	this.unitsOnOrder = unitsOnOrder;
}
public Set<Discount> getDiscount() {
	return discount;
}
public void setDiscount(Set<Discount> discount) {
	this.discount = discount;
}
public Collection<Supplier> getSupliers() {
	return supliers;
}
public void setSupliers(Collection<Supplier> supliers) {
	this.supliers = supliers;
}
public Collection<Orders> getCurrentOrders() {
	return currentOrders;
}
public void setCurrentOrders(Collection<Orders> currentOrders) {
	this.currentOrders = currentOrders;
}
}
