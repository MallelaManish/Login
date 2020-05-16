package com.cg.login.service;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.login.dao.LoginDao;
import com.cg.login.entity.Login;

@Service
public class LoginService {
	
	@Autowired
	private LoginDao loginDao;
	public void setLoginDao()
	{
		this.loginDao=loginDao;
	}

	@Transactional
	public Optional<Login> login(int empId) {
		return loginDao.findById(empId);
	}
	@Transactional
	public List<Login> loginDetails()
	{
		return loginDao.findAll();
	}
	
}