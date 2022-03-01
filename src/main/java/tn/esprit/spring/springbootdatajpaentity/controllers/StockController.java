package tn.esprit.spring.springbootdatajpaentity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.springbootdatajpaentity.entity.Stock;
import tn.esprit.spring.springbootdatajpaentity.service.StockService;

@RestController
@RequestMapping("/stock")
public class StockController {

	@Autowired
	StockService stockService;

	@GetMapping("/retrieve-all-stocks")
	@ResponseBody
	public List<Stock> getstocks() {
		List<Stock> liststocks = stockService.retrieveAllStocks();
		return liststocks;
	}

	@GetMapping("/retrieve-stock/{stock-id}")
	@ResponseBody
	public Stock retrievestock(@PathVariable("stock-id") Long stockId) {
		return stockService.retrieveStock(stockId);
	}

	@PostMapping("/add-stock")
	@ResponseBody
	public Stock addstock(@RequestBody Stock c) {
		Stock stock = stockService.addStock(c);
		return stock;
	}

	@DeleteMapping("/remove-stock/{stock-id}")
	@ResponseBody
	public void removestock(@PathVariable("stock-id") Long stockId) {
		stockService.deleteStock(stockId);
	}

	@PutMapping("/modify-stock")
	@ResponseBody
	public Stock modifystock(@RequestBody Stock stock) {
		return stockService.updateStock(stock);
	}
}
