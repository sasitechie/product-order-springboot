package org.learning.service;

import org.learning.vo.OrderVO;
import org.learning.vo.ProductVO;
import org.springframework.stereotype.Service;
@Service
public interface ProductService {

	ProductVO getProducts();

	OrderVO getOrders(String id);

	

}
