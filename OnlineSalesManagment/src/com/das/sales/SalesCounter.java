package com.das.sales;

import java.util.Date;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.das.Product;
import com.das.sales.order.Orders;
import com.das.sales.order.OrderDetail;
import com.das.sales.order.Payment;
import com.das.transactions.Discount;
import com.das.transactions.ProdCategory;
import com.das.users.Address;
import com.das.users.ContactDetail;
import com.das.users.Customer;
import com.das.users.Supplier;
import com.das.users.User;

public class SalesCounter {
	public static void main(String args[]){
		//<--contactdetail-->
		ContactDetail contactDetail=new ContactDetail();
		contactDetail.setEmail("kdaskirti@gmail.com");
		//<--Discount-->
		Discount discount=new Discount();
		discount.setStartDate(new Date());
		//<--ProdCategory-->

		ProdCategory prodCategory=new ProdCategory();
		prodCategory.setCategoryName("");
		//<--Address-->
        Address address=new Address();
		address.setAddressLine1("address_line1");
		Address address1=new Address();
		address1.setAddressLine1("Second_Address_Line");
		Address address2=new Address();
		address2.setAddressLine1("Second_Address_Line");
		
		//<--Payment-->
		Payment payment=new Payment();
		payment.setPaymentAmount(300.2f);
		payment.setProcessed(true);
		//<--User-->
				User user=new User();
				user.setUserName("");
				user.setPassword("");
				user.getUserAddress().add(address);
		//<--Orders-->
		Orders orders=new Orders();
		orders.setErrLoc("");
		orders.setErrMsg("");
		orders.setOrderDate(new Date());
		orders.setSalesTax(30.5f);
		orders.setTransactionStatus(null);
		orders.setFulFilled(true);
		orders.setPaid(true);
		orders.getPayment().add(payment);
		//<--Customer-->
		Customer customer1=new Customer();
		customer1.setFirstName("FirstName");
		customer1.setLastName("LastName");
		customer1.setCustomerSience(new Date());
		customer1.getShippingAddress().add(address1);
		customer1.getBillingAddress().add(address2);
		customer1.getOrder().add(orders);
		//<--Product-->
		Product product=new Product();
		product.setProductName("ProductName");
		product.setProductDescription("ProductDescription");
		product.setRanking(1);
		product.setDiscountStartDate(new Date());
		product.setDiscountEndDate(new Date());
		product.setQuantityPerUnit(30.4f);
		product.setUnitPrice(60.8f);
		product.setMsrp(50.5f);
		product.setAvailableSize("AvailableSize");
		product.setAvailableColors("AvailableColors");
		product.getCategory().add(prodCategory);
		product.setUnitWeight(25.6f);
		product.setUnitsInStock(19.9f);
		product.setUnitsOnOrder(20.2f);
		product.getDiscount().add(discount);
		product.getCurrentOrders().add(orders);
		//<--Supplier-->
		Supplier supplier=new Supplier();
		supplier.setCompanyName("CompanyName");
		supplier.setContactFName("ContactFName");
		supplier.setContactLName("ContactLName");
		supplier.getSupplierContactDetail().add(contactDetail);
		supplier.getDiscounts().add(discount);
		supplier.getSuppliedProducts().add(product);
		supplier.getPaymentAccepted().add(payment);
		supplier.getCurrentOrder().add(orders);
		//<--OrderDetail-->
		OrderDetail orderDetail=new OrderDetail();
		orderDetail.setPrice(50.5f);
		orderDetail.setQuantity(20.6f);
		orderDetail.setTotal(100.5f);
		orderDetail.setSize(10.10f);
		orderDetail.setColor("Color");
		orderDetail.setFulfilled(true);
		orderDetail.setBillDate(new Date());
		orderDetail.setShipDate(new Date());
		orderDetail.getDiscount().add(discount);
		orderDetail.getProduct().add(product);
		orderDetail.getOrder().add(orders);
	SessionFactory factory=new Configuration().configure
("com/das/hibernate/config/hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(payment);
		session.save(orders);
		session.save(customer1);
		session.save(product);
		session.save(supplier);
		session.save(orderDetail);
		session.getTransaction().commit();
		session.close();
	}
}
