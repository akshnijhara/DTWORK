package com.niit.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.BillingAddressDAO;
import com.niit.model.BillingAddress;
@Repository
public class BillingAddressDAOImpl implements BillingAddressDAO{
@Autowired
private SessionFactory sessionFactory;
	public void addBillingAddress(BillingAddress billingAddress) {
		sessionFactory.getCurrentSession().save(billingAddress);
		
	}

	public void deleteBillingAddress(BillingAddress billingAddress) {
		sessionFactory.getCurrentSession().delete(billingAddress);
	}

	public BillingAddress getBillingAddressById(BillingAddress billsId) {
	return	(BillingAddress) sessionFactory.getCurrentSession().get(BillingAddress.class, billsId);
	}

	
	

	public List<BillingAddress> getAllBillingAddresses() {
	return	sessionFactory.getCurrentSession().createQuery("from BillingAddress").list();
	}

	public void editBillingAddress(BillingAddress billingAddress) {
		sessionFactory.getCurrentSession().update(billingAddress);
		
	}

	@Override
	public BillingAddress getBillingAddressById(int billsId) {
		// TODO Auto-generated method stub
		return null;
	}

}
