package com.dxc.moneype.service;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.MoneyTransfer;

@Service
public interface IMoneyTransferService {

	
	
	public MoneyTransfer add(MoneyTransfer transfer);
}
