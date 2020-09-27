package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.WaterBill;
import com.dxc.moneype.repository.WaterBillRepository;

@Service
public class WaterBillImp implements IWaterBillService {

	
	@Autowired
	WaterBillRepository repo;
	@Override
	public WaterBill add(WaterBill bill) {
		return repo.save(bill);
	}
}
