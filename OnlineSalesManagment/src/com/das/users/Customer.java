package com.das.users;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer extends User {
	@Id
	private int customerId;
	private int room,postalCode,phone,password,creditCardTypeId,billingPostalCode,shipPostalCode;
	private Date dateEntered;
	private String firstName,lastName,address1,address2,building;
	private String city,state,country,email,voiceMail;
	private String creditCard,cardExpMO,cardExpYr,billingAddress,billingCity;
	private String billingRegion,billingCountry,shipAddress,shipCity,shipRegion,shipCountry;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getCreditCardTypeId() {
		return creditCardTypeId;
	}
	public void setCreditCardTypeId(int creditCardTypeId) {
		this.creditCardTypeId = creditCardTypeId;
	}
	public int getBillingPostalCode() {
		return billingPostalCode;
	}
	public void setBillingPostalCode(int billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}
	public int getShipPostalCode() {
		return shipPostalCode;
	}
	public void setShipPostalCode(int shipPostalCode) {
		this.shipPostalCode = shipPostalCode;
	}
	public Date getDateEntered() {
		return dateEntered;
	}
	public void setDateEntered(Date dateEntered) {
		this.dateEntered = dateEntered;
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
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVoiceMail() {
		return voiceMail;
	}
	public void setVoiceMail(String voiceMail) {
		this.voiceMail = voiceMail;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	public String getCardExpMO() {
		return cardExpMO;
	}
	public void setCardExpMO(String cardExpMO) {
		this.cardExpMO = cardExpMO;
	}
	public String getCardExpYr() {
		return cardExpYr;
	}
	public void setCardExpYr(String cardExpYr) {
		this.cardExpYr = cardExpYr;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getBillingCity() {
		return billingCity;
	}
	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}
	public String getBillingRegion() {
		return billingRegion;
	}
	public void setBillingRegion(String billingRegion) {
		this.billingRegion = billingRegion;
	}
	public String getBillingCountry() {
		return billingCountry;
	}
	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}
	public String getShipAddress() {
		return shipAddress;
	}
	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}
	public String getShipCity() {
		return shipCity;
	}
	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}
	public String getShipRegion() {
		return shipRegion;
	}
	public void setShipRegion(String shipRegion) {
		this.shipRegion = shipRegion;
	}
	public String getShipCountry() {
		return shipCountry;
	}
	public void setShipCountry(String shipCountry) {
		this.shipCountry = shipCountry;
	}
}
