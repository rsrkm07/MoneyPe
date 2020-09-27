package com.dxc.moneype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.moneype.entities.MoneyTransfer;
import com.dxc.moneype.service.IMoneyTransferService;

@RestController
@RequestMapping("/money")
public class MoneyTransferController {

	
	@Autowired
	MoneyTransfer transfer;
	@Autowired
	IMoneyTransferService service;
	@PostMapping(path="/add")
	public MoneyTransfer add(MoneyTransfer transfer) {
		return service.add(transfer);
	}
}
