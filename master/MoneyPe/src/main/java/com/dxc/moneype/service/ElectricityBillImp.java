package com.dxc.moneype.service;



import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.ElectricityBill;
import com.dxc.moneype.repository.ElectricityBillRepository;
@Service
public class ElectricityBillImp implements IElectricityBillService{

ElectricityBillRepository repo;
	@Override
	public ElectricityBill add(ElectricityBill bill) {

		return repo.save(bill);
	}

}
