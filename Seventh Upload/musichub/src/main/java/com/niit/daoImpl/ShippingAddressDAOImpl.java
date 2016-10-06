package com.niit.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.ShippingAddressDAO;
import com.niit.model.ShippingAddress;

@Repository
public class ShippingAddressDAOImpl implements ShippingAddressDAO {
@Autowired
private SessionFactory sessionFactory;
	public void addShippingAddress(ShippingAddress shippingAddress) {
		sessionFactory.getCurrentSession().save(shippingAddress);	
	}

	public void deleteShippingAddress(ShippingAddress shippingAddress) {
		sessionFactory.getCurrentSession().delete(shippingAddress);		
	}

	public ShippingAddress getShippingAddressById(int ShippingAddress) {
		return (com.niit.model.ShippingAddress) sessionFactory.getCurrentSession().get(ShippingAddress.class, ShippingAddress);
	}

	public void editShippingAddress(ShippingAddress shippingAddress) {
		sessionFactory.getCurrentSession().update(shippingAddress);		
	}

	public List<ShippingAddress> getAllShippingAddresses() {
	return 	sessionFactory.getCurrentSession().createQuery("from ShippingAddress").list();
	}

}
