package com.niit.service;

import java.util.List;

import com.niit.model.Product;

public interface ProductService {
	public void addProduct(Product product);
	public void deleteProduct(Product product);
	public Product getProductById(int pid);
	public void editProduct(Product product);
	public List<Product> getAllProducts();
}
