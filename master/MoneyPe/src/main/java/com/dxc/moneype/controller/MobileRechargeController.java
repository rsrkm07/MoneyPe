package com.dxc.moneype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.moneype.entities.MobileRecharge;
import com.dxc.moneype.service.IMobileRechargeService;

@RestController
@RequestMapping("/recharge")
public class MobileRechargeController {
	
	
	@Autowired
	MobileRecharge recharge;
	@Autowired
	IMobileRechargeService service;
	
	
	@PostMapping(path="/add")
	public MobileRecharge add(@RequestBody MobileRecharge recharge) {
		return service.add(recharge);
	}

}
