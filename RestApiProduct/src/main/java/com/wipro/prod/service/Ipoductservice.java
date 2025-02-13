package com.wipro.prod.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.prod.entity.Product;

public interface Ipoductservice {

	
	public Product insertProd(Product pr);
	
	public Product findByprices(double price);
	
	public List<Product> findBygt(double price);
	
	public List<Product> getall();
	
	public List<Product> getallpro();
	
	public Product updet(int productId);
	

}
