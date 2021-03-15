package com.ibm;
public class Account {
	private String AccHolderName;
	private float balance;
	
	public  Account(String AccHolderName) {
		this.AccHolderName = AccHolderName;
		//this.balance= balance;
		
		
	}
	public String getAccHolderName() {
		return AccHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		AccHolderName = accHolderName;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return AccHolderName;
	}
	
}
