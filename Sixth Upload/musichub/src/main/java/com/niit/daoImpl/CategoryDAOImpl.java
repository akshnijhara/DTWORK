package com.niit.daoImpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;
@Repository
public class CategoryDAOImpl implements CategoryDAO{
@Autowired
private SessionFactory sessionFactory;
	public void addCategory(Category category) {
		sessionFactory.getCurrentSession().save(category);		
	}

	public void deleteCategory(Category category) {
		sessionFactory.getCurrentSession().delete(category);
		
	}

	public Category getCategoryById(Category cid) {
	return	(Category) sessionFactory.getCurrentSession().get(Category.class, (Serializable) cid);
	}

	public void editCategory(Category category) {
		sessionFactory.getCurrentSession().update(category);
		
	}

	public List<Category> getAllCategories() {
	return	sessionFactory.getCurrentSession().createQuery("from Category").list();
		}

	@Override
	public Category getCategoryById(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
