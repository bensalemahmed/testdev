package tn.esprit.spring.springbootdatajpaentity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.springbootdatajpaentity.entity.Stock;

@Service
public interface StockService{
	
	List<Stock> retrieveAllStocks();
	
	Stock addStock(Stock s);
	
	Stock updateStock(Stock u);
	
	Stock retrieveStock(Long id);
	
	void deleteStock(Long id);

}
