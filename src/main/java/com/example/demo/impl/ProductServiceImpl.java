package com.example.demo.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepo repo; 
	
	@Override
	public Integer addProduct(Product p) {
		Integer pId = repo.save(p).getpId();
		return pId;
	}

	@Override
	public List<Product> getAllProduct() {
		return repo.findAll();	
	}

	@Override
	public Product getOneProduct(Integer id) {
		Optional<Product> p = repo.findById(id);
		Product product = p.orElseThrow(()-> new ProductNotFoundException("Sorry! Product is not available at this time"));
		return product;
	}

	@Override
	public void deleteProduct(Integer id) {
		Product p = getOneProduct(id);
		repo.delete(p);
	}

	@Override
	public Integer updateProduct(Product p) {
		Integer pId = repo.save(p).getpId();
		return pId;
	}





	


	

	

	


		
		

	
}
