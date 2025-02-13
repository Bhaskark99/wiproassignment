package com.wipro.prod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.wipro.prod.entity.Product;
import com.wipro.prod.rep.ProductResp;

@Service
public class ProductImpl implements Ipoductservice {
	@Autowired
	ProductResp re;

	@Override
	public Product insertProd(Product pr) {
		
		return re.save(pr);
	}

	@Override
	public Product findByprices(double price) {
		return re.findByprice(price);
	}

	@Override
	public List<Product> findBygt(double price) {
		
		return re.findBypriceGreaterThan(price);
	}

	@Override
	public List<Product> getall() {
		
		return re.findAll(Sort.by("price"));
	}

	@Override
	public List<Product> getallpro() {
		
		return re.getallpro();
	}

	@Override
	public Product updet(int productId) {
		
		return re.updpr(productId);
	}
	

	


	
}
