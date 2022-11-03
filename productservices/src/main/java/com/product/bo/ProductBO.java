package com.product.bo;

import com.product.dto.Product;

public interface ProductBO {
	
	void create(Product product);
	Product findProduct(int id);
	

}
