package com.dxc.moneype.service;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.UserRegistration;
import com.dxc.moneype.repository.UserRegistrationRepository;
@Service
public class UserRegistrationImp implements IUserRegistrationService {
	UserRegistrationRepository repo;

	@Override
	public UserRegistration add(UserRegistration register) {
		// TODO Auto-generated method stub
		return repo.save(register);
	}

}
