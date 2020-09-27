package com.dxc.moneype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.moneype.entities.WaterBill;
import com.dxc.moneype.service.IWaterBillService;

@RestController
@RequestMapping("/waterbill")
public class WaterBillController {

	
	@Autowired
	WaterBill bill;
	@Autowired
	IWaterBillService service;
	@PostMapping(path="/add")
	public WaterBill add(WaterBill bill) {
		return service.add(bill);
	}
}
