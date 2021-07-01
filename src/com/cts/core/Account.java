package com.cts.core;

public class Account {
	//Instance variables/global variables have default values
	//Each object will have an independent copy of each instance variables
	private String accountId;
	private String customerName;
	private String accountType;
	private double balance;
	private static int count;// for all objects there should be a single copy
	
	
	public Account() {
		// TODO Auto-generated constructor stub
		count++;
	}

	public Account(String accountId, String customerName, String accountType, double balance) {
		super();
		this.accountId = accountId;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;
		count++;
	}

	public String getAccountId() {
		return accountId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}

	public static int getCount() {
		return count ;
	}
	public double deposit(double depositAmount) {
		if(depositAmount>0)
			this.setbalance(this.getBalance()+depositAmount);
		return this.getBalance();
	}
	
	private void setbalance(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customerName=" + customerName + ", accountType=" + accountType
				+ ", balance=" + balance + "]";
	}
	
}
