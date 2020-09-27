package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.LifeInsurance;
import com.dxc.moneype.repository.LifeInsuranceRepository;

@Service

public class LifeInsuranceImp implements ILifeInsuranceService {
	@Autowired
	LifeInsuranceRepository repo;
	
	
	@Override
	public LifeInsurance  add(LifeInsurance insurance) {
		// TODO Auto-generated method stub
				return repo.save(insurance);
	}

}
