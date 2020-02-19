package zzz.com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import zzz.com.model.Product;
import zzz.com.service.ProductService;

@RestController(value = "/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<Product>> get() {		
		return ResponseEntity.status(HttpStatus.OK)
				.body(service.getProducts());
	}

	
}
