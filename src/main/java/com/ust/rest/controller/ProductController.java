package com.ust.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.ust.rest.model.Product;
import com.ust.rest.service.ProductService;

@RestController
@RequestMapping("/product/api")
public class ProductController {
	@Autowired
	private ProductService service;
	
	Logger logger = Logger.getLogger("ProductController.class");
	@GetMapping(value="/productid/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Product>> getProductsById(@PathVariable("id") int id)
	{
		return null;
	}
	@GetMapping(value="/brand/{brand}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getByBrand(@PathVariable ("brand")String brand)
	{
		return null;
	}
	@PostMapping(value="/addProduct",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> addProduct(@RequestBody Product product)
	{
		logger.info("entered post method" + product);
		Product savedProduct = service.addProduct(product);
		logger.info("product posted "+savedProduct);
		return ResponseEntity.ok(savedProduct);
		
	}	
	@GetMapping(value="/productsinfo",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> displayProducts()
	{
		
		
		return null; //ResponseEntity.status(HttpStatus.OK).
		
	}
	@PutMapping(value="/modify",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> updateProduct(@RequestBody Product product)
	{
		
		return null;
		
		
	}
	@DeleteMapping(value="/delete/{id}")
	public void removeById(@PathVariable int id)
	{
		
	}
	
//	@GetMapping("/status")
//	public String status()
//	{
//		return "Running.....!";
//	}
//	@GetMapping("/time")
//	public String time()
//	{
//		return new Date().getTime()+"";
//	}
//	
//	@PostMapping
//	public String post(int a) {
//		return "Posted " + a;
//	}

}
