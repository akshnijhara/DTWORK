package com.niit.service;

import java.util.List;
import com.niit.model.Suppliers;

public interface SupplierService {
	public void addSupplier(Suppliers suppliers);//copy DAO lines

	public void deleteSupplier(Suppliers suppliers);
	public Suppliers getSupplierById(int sid);
	public void editSupplier(Suppliers suppliers); 
	public List<Suppliers> getAllSupplier();
}
