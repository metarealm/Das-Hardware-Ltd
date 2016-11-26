package com.das.sales.order;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Orders implements IOrder {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	private String orderNumber;
	private Date orderDate;
	private float salesTax;
	private Enum transactionStatus;
	private String errLoc,errMsg;
	private boolean fulfilled,paid;
	}


