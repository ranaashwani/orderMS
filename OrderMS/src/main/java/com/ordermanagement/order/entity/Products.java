package com.ordermanagement.order.entity;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;

import javax.persistence.Embeddable;


@Embeddable
public class Products implements Serializable {
	
	@Column(name="ORDERID")
	private Integer orderId;
	
	@Column(name="PRODID")
	private Integer prodId;
	
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	
	
	
	public Products() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Products(Integer orderId, Integer prodId) {
		// TODO Auto-generated constructor stub
		this.orderId=orderId;
		this.prodId=prodId;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderId;
		result = prime * result + prodId;
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		if (orderId != other.orderId) 
			//if (other.orderId != null)
			return false;
		//} else if (!orderId.equals(other.orderId))
			//return false;
		if (prodId != other.prodId) 
			//if (other.prodId != null)
			return false;
		//} else if (!prodId.equals(other.prodId))
			//return false;
		return true;
	}
}		
	
//	 @Override
//	    public boolean equals(Object o) {
//	        if (this == o) return true;
//	        if (o == null || getClass() != o.getClass()) return false;
//	        EmployeeId that = (EmployeeId) o;
//	        return employeeId.equals(that.employeeId) &&
//	                departmentId.equals(that.departmentId);
//	    }
//
//	    @Override
//	    public int hashCode() {
//	        return Objects.hash(employeeId, departmentId);
//	    }
	
//	
//	@Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Products that = (Products) o;
//        return orderId.equals(that.orderId) && prodId.equals(that.prodId);
//    }
//	
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(orderId, prodId);
//    }
	
	
	
	


