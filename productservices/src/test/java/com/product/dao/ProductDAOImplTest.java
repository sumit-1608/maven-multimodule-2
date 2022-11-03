package com.product.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.product.dto.Product;

class ProductDAOImplTest {

	@Test
	void createShouldAProduct() {
		ProductDAO dao=new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("iphone");
		product.setDescription("good");
		product.setPrice(800);
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("iphone", result.getName());
		
	}

}
