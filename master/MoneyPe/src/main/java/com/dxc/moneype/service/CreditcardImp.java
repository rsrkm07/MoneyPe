package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.CreditCard;
import com.dxc.moneype.repository.CreditcardRepository;

@Service
public class CreditcardImp implements ICreditCardService {
	@Autowired
	
	CreditcardRepository repo;

	
	@Override
	public CreditCard add(CreditCard card) {
		
		return repo.save(card);
	}

}
