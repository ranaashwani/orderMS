package com.ordermanagement.order.entity;

import java.util.Date;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderDetails{
	
	@Id
	@Column(name="ORDERID",nullable=false)
	Integer orderid;

	//	@OneToOne(cascade=CascadeType.ALL)
	//	@JoinColumn(name="BUYERID",unique=true)
	
	@Column(name="BUYERID",nullable=false)
	Integer buyerid;
	
	@Column(name="AMOUNT",nullable = false, length=10)
	Float amount;
	
	@Column(name="DATE")
	Date date;
	
	@Column(name="ADDRESS",nullable = false, length = 100)
	String address;
	
	@Column(name="STATUS",nullable = false, length = 60)
	String status;
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public Integer getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(Integer buyerid) {
		this.buyerid = buyerid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public OrderDetails() {
		super();
	}
	
}
