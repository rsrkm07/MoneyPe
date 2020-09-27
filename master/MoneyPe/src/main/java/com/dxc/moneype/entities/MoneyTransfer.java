package com.dxc.moneype.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component

public class MoneyTransfer {

	
	@Id
	private double accountNo;
	private String BankIFSC;
	private String accountHolder;
	private long amount;
	public double getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}
	public String getBankIFSC() {
		return BankIFSC;
	}
	public void setBankIFSC(String BankIFSC) {
		this.BankIFSC = BankIFSC;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
}
	