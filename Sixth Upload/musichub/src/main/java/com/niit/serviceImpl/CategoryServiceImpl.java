package com.niit.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;
import com.niit.service.CategoryService;
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
@Autowired
private CategoryDAO categoryDAO;
	public void addCategory(Category category) {
		categoryDAO.addCategory(category);
		
	}

	public void deleteCategory(Category category) {
		categoryDAO.deleteCategory(category);
		
	}

	public Category getCategoryById(int cid) {
	return	categoryDAO.getCategoryById(cid);
	}

	public void editCategory(Category category) {
		categoryDAO.editCategory(category);
		
	}

	public List<Category> getAllCategories() {
	return	categoryDAO.getAllCategories();
	}

	@Override
	public Category getCategoryById(Category cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
