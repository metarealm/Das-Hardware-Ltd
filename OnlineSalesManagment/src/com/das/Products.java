package com.das;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	@Id 
	private int productId;
	private int vendorProductId,supplierId,categoryId,quantityPerUnit;
	private int unitPrice,unitWeight,unitInStock,unitOnOrder,recorderLevel,ranking;
	private boolean productAvailable,discountAvailable;
	private float availableSize,size,discount;
	private String sku,idsku,productName,productDescription;
	private String msrp,availableColors,color,picture,note,currentOrder;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getVendorProductId() {
		return vendorProductId;
	}
	public void setVendorProductId(int vendorProductId) {
		this.vendorProductId = vendorProductId;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getQuantityPerUnit() {
		return quantityPerUnit;
	}
	public void setQuantityPerUnit(int quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getUnitWeight() {
		return unitWeight;
	}
	public void setUnitWeight(int unitWeight) {
		this.unitWeight = unitWeight;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	public int getUnitOnOrder() {
		return unitOnOrder;
	}
	public void setUnitOnOrder(int unitOnOrder) {
		this.unitOnOrder = unitOnOrder;
	}
	public int getRecorderLevel() {
		return recorderLevel;
	}
	public void setRecorderLevel(int recorderLevel) {
		this.recorderLevel = recorderLevel;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public boolean isProductAvailable() {
		return productAvailable;
	}
	public void setProductAvailable(boolean productAvailable) {
		this.productAvailable = productAvailable;
	}
	public boolean isDiscountAvailable() {
		return discountAvailable;
	}
	public void setDiscountAvailable(boolean discountAvailable) {
		this.discountAvailable = discountAvailable;
	}
	public float getAvailableSize() {
		return availableSize;
	}
	public void setAvailableSize(float availableSize) {
		this.availableSize = availableSize;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getIdsku() {
		return idsku;
	}
	public void setIdsku(String idsku) {
		this.idsku = idsku;
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
	public String getMsrp() {
		return msrp;
	}
	public void setMsrp(String msrp) {
		this.msrp = msrp;
	}
	public String getAvailableColors() {
		return availableColors;
	}
	public void setAvailableColors(String availableColors) {
		this.availableColors = availableColors;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getCurrentOrder() {
		return currentOrder;
	}
	public void setCurrentOrder(String currentOrder) {
		this.currentOrder = currentOrder;
	}
}
