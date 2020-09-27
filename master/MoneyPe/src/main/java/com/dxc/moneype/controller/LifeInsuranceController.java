package com.dxc.moneype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.moneype.entities.LifeInsurance;
import com.dxc.moneype.entities.UserKyc;
import com.dxc.moneype.service.ILifeInsuranceService;
import com.dxc.moneype.service.IUserKycService;

@RestController
@RequestMapping("/lifeinsurance")
public class LifeInsuranceController {

@Autowired
LifeInsurance insurance;
	@Autowired
	ILifeInsuranceService service;
	@PostMapping(path="/add")
	public LifeInsurance add(@RequestBody LifeInsurance insurance) {
	return service.add(insurance);
}
}