package com.example.demo.custom;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.ProductNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String>  handleProductNotFound(ProductNotFoundException pnfe){
		return new ResponseEntity<String>(pnfe.getMessage(),HttpStatus.NOT_FOUND);
		
	}
}
