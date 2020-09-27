package com.dxc.moneype.entities;

public class MoneyTransfer {
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
	