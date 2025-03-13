package com.sathya.mvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Product 
{
	@Id
	private Long id;
	
	private String name;
	private double price;
	private int quantity;

}
package com.sathya.mvc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sathya.mvc.service.ProductService;
@Controller
public class ProductController{
	  @Autowired
	  ProductService productService;
	  @GetMapping("/wish")
	  public String greet() {
		  return "hello";
	  }
	  
	  @GetMapping("/type")
	  public String greed() {
		  return "nice";
	  }
	  @GetMapping("/help")
	  public String greek() {
		  return "welcome";
	  }
	

}
package com.sathya.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sathya.mvc.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

}
package com.sathya.mvc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sathya.mvc.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> 
{
	

}
