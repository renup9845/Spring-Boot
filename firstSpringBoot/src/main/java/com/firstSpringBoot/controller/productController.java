package com.firstSpringBoot.controller;

import java.util.List;

import com.firstSpringBoot.model.product;
import com.firstSpringBoot.service.productService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
	
	@Autowired
	private productService service;
	
	
	//Handling the Request
	//Controller to get all products
	@RequestMapping(method=RequestMethod.GET ,value="/products")

	//Processing the Request
	public List <product> getProducts() {
		return service.getAllProducts();
	}
	
	//Controller to get specified product
	@RequestMapping(method = RequestMethod.GET,value="/product/{id}")
	public product getProduct(@PathVariable int id) {
		return service.getProduct(id);
	}
	
	//Controller to add data
	@RequestMapping(method = RequestMethod.POST,value = "/product")
	public void addProduct(@RequestBody product p1) {
		service.addProduct(p1);
		
	}
	
	
	//Controller To Update Data
	@RequestMapping(method = RequestMethod.PUT, value = "/product/{id}")
	public void updateProduct(@RequestBody product p2, @PathVariable int id) {
		service.updateProduct(p2, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/product/{id}")
	public void deleteProduct(@PathVariable int id) {
		
		service.deleteProduct(id);
		
	}
	
	
	
	
	
	}
	
	
	





