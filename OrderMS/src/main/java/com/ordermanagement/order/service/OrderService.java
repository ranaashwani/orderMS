package com.ordermanagement.order.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.stereotype.Service;

import com.ordermanagement.order.dto.OrderDetailsDTO;
import com.ordermanagement.order.dto.ProductsOrderedDTO;
import com.ordermanagement.order.entity.OrderDetails;
import com.ordermanagement.order.entity.ProductsOrdered;
import com.ordermanagement.order.repository.OrderRepository;
import com.ordermanagement.order.repository.ProductsOrderedRepository;


@Service
public class OrderService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public OrderRepository orderrepo;
	
	@Autowired
	public ProductsOrderedRepository productrepo;
	
	public List<OrderDetailsDTO> getOrders() {
		List<OrderDetails> order = orderrepo.findAll();
		List<OrderDetailsDTO> orderDTO = new ArrayList<>();

		for (OrderDetails orderDetails : order) {
			OrderDetailsDTO orderdetailsDTO = OrderDetailsDTO.valueOf(orderDetails);
			orderDTO.add(orderdetailsDTO);
		}

		logger.info("Order details : {}", orderDTO);
		return orderDTO;
	}

	public OrderDetailsDTO getParticularOrders(Integer orderid) {
		return OrderDetailsDTO.valueOf(orderrepo.getOne(orderid));
	}

	public List<ProductsOrderedDTO> getProducts() {
		List<ProductsOrdered> products= productrepo.findAll();
		List<ProductsOrderedDTO> productsDTO = new ArrayList<>();
		
		for (ProductsOrdered productsOrder : products) {
			ProductsOrderedDTO proDTO = ProductsOrderedDTO.valueOf(productsOrder);
			productsDTO.add(proDTO);
		}
		
		logger.info("Order details : {}", productsDTO);
		return productsDTO;
		
	}

	public void getOrderDetails(OrderDetailsDTO orderDTO) {
		logger.info("Creation request for customer {}", orderDTO);
		OrderDetails order = orderDTO.createEntity();
		orderrepo.save(order);
		
		
	}

	public void updateOrder(OrderDetailsDTO orderDTO) {
		
		OrderDetailsDTO orderDTO1=orderDTO;
		OrderDetails order=orderDTO1.createEntity();
		orderrepo.save(order);
	}

	
}
