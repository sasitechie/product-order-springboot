package org.learning.service;

import java.util.List;

import org.learning.vo.StockVO;
import org.springframework.stereotype.Service;

@Service
public interface StockService {

	List<StockVO> getStocks();

}
