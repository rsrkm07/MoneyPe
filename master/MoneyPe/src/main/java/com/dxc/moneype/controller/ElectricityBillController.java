package com.dxc.moneype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.moneype.entities.ElectricityBill;

import com.dxc.moneype.service.IElectricityBillService;
;

@RestController
@RequestMapping("/ElectricityBill")
public class ElectricityBillController {

@Autowired
ElectricityBill bill;
	@Autowired
	IElectricityBillService service;
	@PostMapping(path="/add")
	public ElectricityBill add(@RequestBody ElectricityBill bill) {
		return service.add(bill);
	}
}

