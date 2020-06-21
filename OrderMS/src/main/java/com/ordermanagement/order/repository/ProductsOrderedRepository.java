package com.ordermanagement.order.repository;

//import java.util.List;

//import javax.persistence.EntityManager;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ordermanagement.order.entity.ProductsOrdered;

@Repository
public interface ProductsOrderedRepository extends JpaRepository<ProductsOrdered, Integer>{
	
	
}

