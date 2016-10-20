package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.AuthorityDAO;
import com.niit.model.Authority;
import com.niit.service.AuthorityService;

@Service
@Transactional
public class AuthorityServiceImpl implements AuthorityService{
@Autowired
private AuthorityDAO authorityDAO;
	@Override
	public void addAuthority(Authority authority) {
		authorityDAO.addAuthority(authority);		
	}

	@Override
	public void deleteAuthority(Authority authority) {
		authorityDAO.deleteAuthority(authority);		
	}

	@Override
	public Authority getAuthorityById(int authoritiesId) {
		return authorityDAO.getAuthorityById(authoritiesId);
	}

	@Override
	public void editAuthority(Authority authority) {
		authorityDAO.editAuthority(authority);		
	}

	@Override
	public List getAllAuthority() {
		return authorityDAO.getAllAuthority();
	}

}
