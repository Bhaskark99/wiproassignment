package com.wipro.prod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.wipro.prod.entity.Product;
import com.wipro.prod.service.Ipoductservice;
import com.wipro.prod.service.ProductImpl;

@RestController
public class Restcontro {
	@Autowired
	ProductImpl ie;
	@PostMapping("/inser")
	public Product insertdata(@RequestBody Product pr)
	{
		return ie.insertProd(pr);
	}
	@GetMapping("/get/{price}")
	public Product findBypr(@PathVariable double price)
	{
		return ie.findByprices(price);
	}
	@GetMapping("/getprice/{price}")
	public List<Product> findbyprices(double price)
	{
		return ie.findBygt(price);
	}
	@GetMapping("/getall")
	public List<Product> getallprice()
	{
		return ie.getall();
	}
	@GetMapping("/getallprod")
	public List<Product> getallp()
	{
		return ie.getallpro();
	}
	@PostMapping("/upd/{productId}")
	public Product updtat(@PathVariable int productId,@RequestBody Product pr)
	{
		return ie.updet(productId);
	}

}
