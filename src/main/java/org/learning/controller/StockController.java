package org.learning.controller;

import java.util.List;

import org.learning.service.StockService;
import org.learning.vo.StockVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class StockController {
	
	@Autowired
	StockService service;
	@GetMapping("/stock")
	public List<StockVO> getStocks(){
		return service.getStocks();
	}

}
