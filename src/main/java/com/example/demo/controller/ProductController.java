package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/add")
	public ResponseEntity<String> addProduct(@RequestBody Product p){
		service.addProduct(p);
		return new ResponseEntity<String>("Product Added Successfully!",HttpStatus.OK);	
	}
	
	
	@GetMapping("/getall")
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> plist = service.getAllProduct();
		return new ResponseEntity<List<Product>>(plist,HttpStatus.OK);
	}
	
	
	@GetMapping("/getone/{id}")
	public ResponseEntity<Product> getOneProduct(@PathVariable int id){
		Product p = service.getOneProduct(id);
		return new ResponseEntity<Product>(p,HttpStatus.OK);
		}
	

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer id){
		service.deleteProduct(id);
		return new ResponseEntity<String>("Product Deleted Successfully!",HttpStatus.OK);
		 
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateProduct(@RequestBody Product p){
		Integer pId = service.updateProduct(p);
		return new ResponseEntity<String>("Product Updated Successfully!" + pId,HttpStatus.OK);
	}
}
