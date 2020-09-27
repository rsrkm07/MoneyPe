

package com.dxc.moneype.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dxc.moneype.entities.UserKyc;
import com.dxc.moneype.service.IUserKycService;
@RestController
@RequestMapping("/kyc")
public class UserKycController {
@Autowired
UserKyc kyc;
@Autowired
IUserKycService service;
@PostMapping("/addkyc")
public UserKyc add(@RequestBody UserKyc kyc) {
return service.add(kyc);
}}

