package com.dxc.moneype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.moneype.entities.CreditCard;
import com.dxc.moneype.service.ICreditCardService;

@RestController
@RequestMapping
public class CreditCardController {

	@Autowired
	CreditCard card;
	@Autowired
	ICreditCardService service;
	
	@PostMapping(path="/add")
	public CreditCard add(CreditCard card){
		return service.add(card);
	}
}
