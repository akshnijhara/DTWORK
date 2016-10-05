package com.niit.service;

import java.util.List;

import com.niit.model.BillingAddress;

public interface BillingAddressService {
	public void addBillingAddress(BillingAddress billingAddress);
	public void deleteBillingAddress(BillingAddress billingAddress);
	public BillingAddress getBillingAddressById(int billsId);
	public void editBillingAddress(BillingAddress billingAddress);
	public List<BillingAddress> getAllBillingAddresses();
}
