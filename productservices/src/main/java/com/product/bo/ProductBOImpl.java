package com.product.bo;

import com.product.dao.ProductDAO;
import com.product.dao.ProductDAOImpl;
import com.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	
	private static ProductDAO dao=new ProductDAOImpl();

	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.create(product);

	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

}
