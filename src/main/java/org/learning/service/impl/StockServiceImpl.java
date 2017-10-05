package org.learning.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.learning.service.StockService;
import org.learning.vo.StockVO;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {

	@Override
	public List<StockVO> getStocks() {
		List<StockVO> list = new ArrayList<>();
		StockVO stk = new StockVO();
		stk.setItemId("STK001");
		stk.setItemModel("MDSHIRT");
		stk.setItemName("SHIRT");
		stk.setStockQty("3");
		
		StockVO stk1 = new StockVO();
		stk1.setItemId("STK001");
		stk1.setItemModel("MDSHIRT");
		stk1.setItemName("SHIRT");
		stk1.setStockQty("3");
		list.add(stk);
		list.add(stk1);
		return list;
	}

}
