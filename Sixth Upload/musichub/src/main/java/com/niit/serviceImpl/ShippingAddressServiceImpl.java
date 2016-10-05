package com.niit.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ShippingAddressDAO;
import com.niit.model.ShippingAddress;
import com.niit.service.ShippingAddressService;
@Service
@Transactional
public class ShippingAddressServiceImpl implements ShippingAddressService{
@Autowired
private ShippingAddressDAO shippingAddressDAO;
	public void addShippingAddress(ShippingAddress shippingAddress) {
		shippingAddressDAO.addShippingAddress(shippingAddress);		
	}

	public void deleteShippingAddress(ShippingAddress shippingAddress) {
		shippingAddressDAO.deleteShippingAddress(shippingAddress);		
	}

	public ShippingAddress getShippingAddressById(int ShippingAddress) {
	return	shippingAddressDAO.getShippingAddressById(ShippingAddress);
	}

	public void editShippingAddress(ShippingAddress shippingAddress) {
		shippingAddressDAO.editShippingAddress(shippingAddress);
		
	}

	public List<ShippingAddress> getAllShippingAddresses() {
		return shippingAddressDAO.getAllShippingAddresses();
	}

}
