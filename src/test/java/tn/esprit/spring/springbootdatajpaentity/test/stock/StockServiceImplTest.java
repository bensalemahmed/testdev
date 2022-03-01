package tn.esprit.spring.springbootdatajpaentity.test.stock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.springbootdatajpaentity.entity.Stock;
import tn.esprit.spring.springbootdatajpaentity.service.StockService;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StockServiceImplTest {
	@Autowired
	StockService stockService;
		
	@Test
	@Order(1)
	public void testAddStock() {
		Stock s = new Stock();
		s.setLibStock("stock test");
		s.setQte(10);
		s.setQteMin(100);
		Stock savedStock= stockService.addStock(s);
		assertNotNull(savedStock);
		assertNotNull(savedStock.getLibStock());
	}
	
	@Test
	@Order(2)
	public void removeStock() {
		Stock savedStock= stockService.addStock(new Stock());
		stockService.deleteStock(savedStock.getIdStock());
		assertNull(stockService.retrieveStock(savedStock.getIdStock()));
	}
}
