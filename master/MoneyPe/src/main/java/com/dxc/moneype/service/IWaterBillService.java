package com.dxc.moneype.service;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.WaterBill;

@Service
public interface IWaterBillService {

	
	public WaterBill add(WaterBill bill);
}
