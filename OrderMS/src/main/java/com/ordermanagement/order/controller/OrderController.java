package com.ordermanagement.order.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ordermanagement.order.dto.OrderDetailsDTO;
import com.ordermanagement.order.dto.ProductsOrderedDTO;
import com.ordermanagement.order.repository.OrderRepository;
import com.ordermanagement.order.service.OrderService;


@RestController
@CrossOrigin
@RequestMapping(value="/api")
public class OrderController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	public OrderService orderService;
	@Autowired
	 OrderRepository orderRepo;
	                                 
	@PostMapping(value = "orders/orderdetails/{orderId}",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public void getOrderDetails(@RequestBody OrderDetailsDTO orderDTO) {
		logger.info("Creation request for customer {}", orderDTO);
		orderService.getOrderDetails(orderDTO);
	}
	
	@GetMapping(value = "/orderdetails",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OrderDetailsDTO> getOrders() {
		return orderService.getOrders();
	}
	
	
	@GetMapping(value= "/orderdetails/{orderid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderDetailsDTO getParticularOrder(@PathVariable Integer orderid) {
		return orderService.getParticularOrders(orderid);
		
	}
	@GetMapping(value = "/productsordered",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsOrderedDTO> getProducts() {
		return orderService.getProducts();
	}
	
	@DeleteMapping(value = "/orders/delete/{orderId}",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void removeOrder(@PathVariable Integer orderId)
	{
	     orderRepo.deleteById(orderId);
	}
	
	@PutMapping(value="/update/{orderId}")
	public void updateOrder(@PathVariable("orderId") Integer prodId, @RequestBody OrderDetailsDTO orderDTO) {
		logger.info("Updating products in stock {}", orderDTO);
		orderService.updateOrder(orderDTO);
		
		
	}
	
}
