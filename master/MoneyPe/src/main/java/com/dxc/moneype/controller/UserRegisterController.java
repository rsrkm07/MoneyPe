package com.dxc.moneype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.moneype.entities.UserKyc;
import com.dxc.moneype.entities.UserRegistration;
import com.dxc.moneype.service.IUserKycService;
import com.dxc.moneype.service.IUserRegistrationService;

@RestController
@RequestMapping("/UserRegister")
public class UserRegisterController{
	
	@Autowired
	UserRegistration register;
	
	@Autowired
	IUserRegistrationService service;
	
	
	
	@PostMapping(path = "/add")
	public UserRegistration add(@RequestBody UserRegistration register) {
		
		return service.add(register);
	}
	
	
	
	
	

}
