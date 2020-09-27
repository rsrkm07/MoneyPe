package com.dxc.moneype.service;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.LifeInsurance;

@Service

public interface ILifeInsuranceService {
	
	
	public LifeInsurance add(LifeInsurance insurance);

}
