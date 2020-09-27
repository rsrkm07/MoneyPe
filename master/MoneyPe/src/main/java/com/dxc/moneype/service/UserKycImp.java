package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.UserKyc;
import com.dxc.moneype.repository.UserKycRepository;

@Service

	 public class UserKycImp implements IUserKycService {


	 @Autowired

	 UserKycRepository repo;



	@Override

	 public UserKyc add(UserKyc kyc) {


	 return repo.save(kyc);

	 }

}
