package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.MobileRecharge;
import com.dxc.moneype.repository.MobileRechargeRepository;

@Service
public class MobileRechargeImp  implements IMobileRechargeService{
	@Autowired
	
	MobileRechargeRepository repo;
	@Override
	public MobileRecharge add(MobileRecharge recharge) {
		
		return repo.save(recharge);
		
	}

}
