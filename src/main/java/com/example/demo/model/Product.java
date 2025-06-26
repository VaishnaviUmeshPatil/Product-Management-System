package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private int pId;
	private String pName;
	private String pCategory;
	private double pPrice;
	
	
	public Product() {
		super();
	}


	public Product(int pId, String pName, String pCategory, double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCategory = pCategory;
		this.pPrice = pPrice;
	}


	public int getpId() {
		return pId;
	}


	public void setpId(int pId) {
		this.pId = pId;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public String getpCategory() {
		return pCategory;
	}


	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}
	
	public double getpPrice() {
		return pPrice;
	}


	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}


	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pCategory=" + pCategory + ", pPrice=" + pPrice + "]";
	}

	


	
	
	
	
	
}
