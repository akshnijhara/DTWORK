package com.niit.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.SupplierDAO;
import com.niit.model.Suppliers;
@Repository
public class SupplierDAOImpl implements SupplierDAO{
@Autowired
private SessionFactory sessionFactory;

	public void addSupplier(Suppliers suppliers) {
		sessionFactory.getCurrentSession().save(suppliers);		
	}

	public void deleteSupplier(Suppliers suppliers) {
		sessionFactory.getCurrentSession().delete(suppliers);
		
	}

	public Suppliers getSupplierById(int sid) {
	return	(Suppliers) sessionFactory.getCurrentSession().get(Suppliers.class, sid);
	}

	public void editSupplier(Suppliers suppliers) {
		sessionFactory.getCurrentSession().update(suppliers);		
	}

	public List<Suppliers> getAllSupplier() {
		return sessionFactory.getCurrentSession().createQuery("from suppliers").list();
	}

}