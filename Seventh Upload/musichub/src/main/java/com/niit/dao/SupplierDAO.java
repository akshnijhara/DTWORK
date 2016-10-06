package com.niit.dao;

import java.util.List;

import com.niit.model.Suppliers;

public interface SupplierDAO {
	public void addSupplier(Suppliers suppliers);
	public void deleteSupplier(Suppliers suppliers);
	public Suppliers getSupplierById(int sid);
	public void editSupplier(Suppliers suppliers); 
	public List<Suppliers> getAllSupplier();
}
