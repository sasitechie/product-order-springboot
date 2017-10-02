package org.learning.controller;

import org.learning.service.ProductService;
import org.learning.vo.OrderVO;
import org.learning.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/product")
	public ProductVO getProducts(){
		return service.getProducts();
	}
	
	@GetMapping("/orders/{id}")
	public OrderVO getOrders(@PathVariable String id){
		return service.getOrders(id);
	}

}
