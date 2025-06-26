package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.model.Product;

public interface ProductService {

	Integer addProduct(Product p);
	
	List<Product> getAllProduct();

	Product getOneProduct(Integer id);

	void deleteProduct(Integer id);

	Integer updateProduct(Product p);



	
}

