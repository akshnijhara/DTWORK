package com.niit.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.SupplierDAO;
import com.niit.model.Suppliers;
import com.niit.service.SupplierService;
@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {
@Autowired
private SupplierDAO supplierDAO;
	public void addSupplier(Suppliers suppliers) {
		supplierDAO.addSupplier(suppliers);
		
	}

	public void deleteSupplier(Suppliers suppliers) {
		supplierDAO.deleteSupplier(suppliers);		
	}

	public Suppliers getSupplierById(int sid) {
		return supplierDAO.getSupplierById(sid);
	}

	public void editSupplier(Suppliers suppliers) {
		supplierDAO.editSupplier(suppliers);		
	}

	public List<Suppliers> getAllSupplier() {
	return 	supplierDAO.getAllSupplier();
	}

}