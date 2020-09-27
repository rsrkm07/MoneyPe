package com.dxc.moneype.service;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.MobileRecharge;

@Service
public interface IMobileRechargeService {
  
	public MobileRecharge add(MobileRecharge recharge);

}
