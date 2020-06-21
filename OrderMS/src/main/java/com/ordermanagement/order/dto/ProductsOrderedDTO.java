package com.ordermanagement.order.dto;


import com.ordermanagement.order.entity.ProductsOrdered;

public class ProductsOrderedDTO {
	
	Integer orderid;
	
	Integer prodid;
	
	Integer sellerid;
	
	Integer quantity;
	
	String status;
	
	Float price;
	
	
	public ProductsOrderedDTO() {
		super();
	}
	
	
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getProdid() {
		return prodid;
	}
	public void setProdid(Integer prodid) {
		this.prodid = prodid;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getSellerid() {
		return sellerid;
	}
	public void setSellerid(Integer sellerid) {
		this.sellerid = sellerid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	//convert entity into dto
	public static ProductsOrderedDTO valueOf(ProductsOrdered productsordered) {
		ProductsOrderedDTO productsorderedDTO = new ProductsOrderedDTO();
		productsorderedDTO.setOrderid(productsordered.getProducts().getOrderId());
		productsorderedDTO.setPrice(productsordered.getPrice());
		productsorderedDTO.setProdid(productsordered.getProducts().getProdId());
		productsorderedDTO.setQuantity(productsordered.getQuantity());
		productsorderedDTO.setSellerid(productsordered.getSellerid());
		productsorderedDTO.setStatus(productsordered.getStatus());
		return productsorderedDTO;
	}


	@Override
	public String toString() {
		return "ProductsOrderedDTO [orderid=" + orderid + ", prodid=" + prodid + ", sellerid=" + sellerid
				+ ", quantity=" + quantity + ", status=" + status + ", price=" + price + "]";
	}
	
	
//	@Override
//	public String toString() {
//		return "ProductsOrderedDTO [OrderId=" + orderid + ", ProdId=" + prodid + ", Price=" + price
//				+ ", Quantity=" + quantity + ", SellerId=" + sellerid + ", Status =" + status +"]";
//	}
	
	
	
}