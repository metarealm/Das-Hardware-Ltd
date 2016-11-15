package com.das.sales;
import java.util.Date;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.das.Products;
import com.das.sales.order.Orders;
import com.das.sales.order.OrderDetail;
import com.das.sales.order.Payment;
import com.das.users.Customer;

public class SalesCounter {
	static String type, Operation;
	static int amt;
	public static void main(String args[]){
		System.out.println("inside main of SalesCounter");
		
		
		Inventory inv=new Cement();
		if(args != null && args.length == 3){

			
			String[] opsArr = args[0].split("=");
			String Operation = opsArr[1];
			System.out.println(" Operation   is " + Operation);

			String[] inventoryarray = args[1].split("=");
			String type = inventoryarray[1];
			System.out.println("inventory type  is " + type);
			

			String[] amountArr = args[2].split("=");
			String amount = amountArr[1];
			amt = Integer.parseInt(amount);
			System.out.println("inventory amount  is " + amt);
		}
		
		if(type == "rod"){
			inv = new Rod();
			
		}else if(type == "cement"){
			inv = new Cement();
		}
		
	  
		if (Operation == "buy"){
	    	inv.add(amt);
	    }else if(Operation == "sell"){
	    	inv.sell(amt);
	    }
		
		System.out.println("inventory  type " + type + " has total stock now " + amt);
		Configuration conf=new Configuration();
		conf.configure("com/das/hibernate/config/hibernate.cfg.xml");
		SessionFactory factory=conf.buildSessionFactory();
		
		
		
		Orders o= new Orders();
		o.setOrderId(111);
		o.setOrderNumber(222);
		o.setPaymentId(333);
		o.setOrderDate(new Date());
		o.setShipDate(new Date());
		o.setRequiredDate(new Date());
		o.setShipperId(444);
		o.setFreight(10.5f);
		o.setSalesTax(5.4f);
		o.setTimeStamp("05:20:30");
		o.setTransactStatus(true);
		o.setErrLoc("bbsr");
		o.setErrMsg("location not found");
		o.setFulfiled(true);
		o.setDeleted(true);
		o.setPaid(50.8f);
		o.setPaymentDate(new Date());
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(o);
		tx.commit();
		session.close();
	   
	    OrderDetail od=new OrderDetail();
	    od.setBillDate(new Date());
	    od.setColor("red");
	    od.setDiscont(9.5f);
	    od.setFulfiled(true);
	    od.setIdsku("");
	    od.setOrderDetailId(555);
	    od.setOrderNumber(10);
	    od.setPrice(5000.f);
	    od.setProductId(666);
	    od.setQuantity(6.4f);
	    od.setShipDate(new Date());
	    od.setSize(5.2f);
	    od.setTotal(2525.5f);
	    od.setOrderId(200);
	    Session session2=factory.openSession();
		Transaction tx2=session2.beginTransaction();
		session2.save(od);
		tx2.commit();
		session2.close();
		
		Customer c=new Customer();
		c.setAddress1("");
		c.setAddress2("");
		c.setBillingAddress("");
		c.setBillingCity("");
		c.setBillingCountry("");
		c.setBillingPostalCode(11);
		c.setBillingRegion("");
		c.setBuilding("");
		c.setCardExpMO("");
		c.setCardExpYr("");
		c.setCity("");
		c.setCountry("");
		c.setCreditCard("");
		c.setCreditCardTypeId(22);
		c.setCustomerId(888);
		c.setDateEntered(new Date());
		c.setEmail("");
		c.setFirstName("");
		c.setLastName("");
		c.setPassword(123456);
		c.setPhone(7619);	
		c.setPostalCode(20);
		c.setRoom(5);
		c.setShipAddress("");
		c.setShipCity("");
		c.setShipCountry("");
		c.setShipPostalCode(55);
		c.setShipRegion("");
		c.setState("");
		c.setVoiceMail("");
		Session session3=factory.openSession();
		Transaction tx3=session3.beginTransaction();
		session3.save(c);
		tx3.commit();
		session3.close();
		
		Products p=new Products();
		p.setAvailableColors("");
		p.setAvailableSize(7);
		p.setCategoryId(33);
		p.setColor("");
		p.setCurrentOrder("");
		p.setDiscount(9.4f);
		p.setDiscountAvailable(true);
		p.setIdsku("");
		p.setMsrp("");
		p.setNote("");
		p.setPicture("");
		p.setProductAvailable(false);
		p.setProductDescription("");
		p.setProductId(99);
		p.setProductName("");
		p.setQuantityPerUnit(5);
		p.setRanking(3);
		p.setRecorderLevel(4);
		p.setSize(7.5f);
		p.setSku("");
		p.setSupplierId(100);
		p.setUnitInStock(5000);
		p.setUnitOnOrder(200);
		p.setUnitPrice(70);
		p.setUnitWeight(5);
		p.setVendorProductId(999);
		
		Session session4=factory.openSession();
		Transaction tx4=session4.beginTransaction();
		session4.save(p);
		tx4.commit();
		session4.close();
		Payment pt=new Payment();
		pt.setAllowed(true);
		pt.setPaymentId(123456);
		pt.setPaymentType("");
		Session session5=factory.openSession();
		Transaction tx5=session5.beginTransaction();
		session5.save(pt);
		tx5.commit();
		session5.close();
		factory.close();
    }
}
