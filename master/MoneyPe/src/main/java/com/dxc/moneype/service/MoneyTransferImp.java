package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.MoneyTransfer;
import com.dxc.moneype.repository.MoneyTransferRepository;

@Service
public class MoneyTransferImp  implements IMoneyTransferService{
@Autowired
MoneyTransferRepository repo;
@Override
public MoneyTransfer add(MoneyTransfer transfer) {
	return repo.save(transfer);
}
	
	
}
