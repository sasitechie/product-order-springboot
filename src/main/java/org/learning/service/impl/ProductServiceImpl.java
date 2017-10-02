package org.learning.service.impl;

import org.learning.service.ProductService;
import org.learning.vo.OrderVO;
import org.learning.vo.ProductVO;
import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public ProductVO getProducts() {
		ProductVO productVO = new ProductVO();
		productVO.setPrice("52");
		productVO.setProductId("1");
		productVO.setProductName("Shirt");
		return productVO;
	}

	@Override
	public OrderVO getOrders(String id) {
		OrderVO orderVO = new OrderVO();
		orderVO.setOrderId("ORD1");
		orderVO.setOrderMsg(id + " has placed an order");
		return orderVO ;
	}

}
