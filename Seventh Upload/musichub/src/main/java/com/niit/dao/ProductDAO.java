package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDAO {
public void addProduct(Product product);
public void deleteProduct(Product product);
public Product getProductById(int pid);
public void editProduct(Product product);
public List<Product> getAllProducts();
}
