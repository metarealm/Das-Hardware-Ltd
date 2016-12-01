package com.das.sales;

import java.util.Date;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.das.Products;
import com.das.sales.order.Orders;
import com.das.sales.order.OrderDetail;
import com.das.sales.order.Payment;
import com.das.transactions.Discount;
import com.das.users.Address;
import com.das.users.ContactDetail;
import com.das.users.Customer;
import com.das.users.Supplier;
import com.das.users.User;

public class SalesCounter {
	public static void main(String args[]){
		
		User user=new User();
		user.setUserName("First User");
		user.setPassword("password");
		
		//Customer customer=new Customer();
		//customer.setFirstName("First Name");
		//customer.setLastName("Last Name");
		//customer.setCustomerScience(new Date());
		
		Payment payment=new Payment();
		payment.setPaymentAmount(350.5f);
		payment.setProcessed(true);
		
		Address addr=new Address();
		addr.setCity("First City");
		addr.setState("First State");
		Address addr2=new Address();
		addr2.setCity("Second City");
		addr2.setState("Second State");
		
		ContactDetail cd=new ContactDetail();
		cd.setPhoneNo(761940);
		
		
		
		/*Discount discount=new Discount();
		discount.setStartDate(new Date());
		
		
		Orders order=new Orders();
		
		
		Supplier supplier=new Supplier();
		supplier.setCompanyName("Company Name");
		supplier.setContactFName("Contact Fast Name");
		supplier.setContactLName("Contact Last Name");
		supplier.setSupplierScience(new Date());
		supplier.getSupplierContactDetail().add(cd);
		supplier.getDiscounts().add(discount);
		supplier.getPaymentAccepted().add(payment);*/
		user.getUserAddress().add(addr);
		
		payment.getUserAddress().add(addr);
		
		//customer.getShippingAddress().add(addr);
		//customer.getBillingAddress().add(addr2);
		//customer.getSupplierContactDetail().add(cd);
		//customer.getPaymentMethod().add(payment);
		SessionFactory factory=new Configuration().configure("com/das/hibernate/config/hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(payment);
		//session.save(customer);
		session.getTransaction().commit();
		session.close();
	}
}
