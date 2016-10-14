package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.BillingAddressDAO;
import com.niit.model.BillingAddress;
import com.niit.service.BillingAddressService;

@Service
@Transactional
public class BillingAddressServiceImpl implements BillingAddressService{

	@Autowired
	private BillingAddressDAO billingAddressDAO;
	@Override
	public void addBillingAddress(BillingAddress billingAddress) {
		billingAddressDAO.addBillingAddress(billingAddress);		
	}

	@Override
	public void deleteBillingAddress(BillingAddress billingAddress) {
		billingAddressDAO.deleteBillingAddress(billingAddress);		
	}

	@Override
	public BillingAddress getBillingAddressBYId(int billsId) {
		return billingAddressDAO.getBillingAddressBYId(billsId);
	}

	@Override
	public void editBillingAddress(BillingAddress billingAddress) {
		billingAddressDAO.editBillingAddress(billingAddress);		
	}

	@Override
	public List<BillingAddress> getAllBillingAddress() {
		return billingAddressDAO.getAllBillingAddress();
	}

}
