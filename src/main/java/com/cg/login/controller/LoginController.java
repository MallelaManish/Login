package com.cg.login.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.login.entity.Login;
import com.cg.login.service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	
	
	@Autowired
	private LoginService loginService;
	public void setLoginService()
	{
		this.loginService=loginService;
	}
	
	@GetMapping("/login/{empId}")
	public Optional<Login> loginContoller(@PathVariable int empId)
	{
		return loginService.login(empId);
	}
	
	@GetMapping("/loginDetails")
	public List<Login> loginDetails()
	{
		return loginService.loginDetails();
	}
	
	

}
