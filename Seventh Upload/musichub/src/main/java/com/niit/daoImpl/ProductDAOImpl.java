package com.niit.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
@Autowired
private SessionFactory sessionFactory;
	public void addProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);		
	}

	public void deleteProduct(Product product) {
		sessionFactory.getCurrentSession().delete(product);		
	}

	public Product getProductById(int pid) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, pid);
	}

	public void editProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);
	}

	public List<Product> getAllProducts() {
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

}
