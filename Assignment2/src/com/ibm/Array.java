package com.ibm;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Array  {
	public static void main(String[] args) {
		ArraytoList();
		
	}
	public static void ArraytoList() {
		Account[] accounts = new Account[10];
		for(int i=0; i<accounts.length;i++) {
			Account account =new Account("Shyam"+i);
			accounts[i]=account;
			System.out.println(accounts[i]);
			
			/*/Account[] balances = new Account[10];
			for(int j=0; j<balances.length;j++) {
				Account balance =new Account("20.02f"+j);
				balances[i]=balance;/*/
		}
		//System.out.println(accounts);
		
		List<Account> AccholderName =new ArrayList<Account>();
		//List<Account> Balance =new ArrayList<Account>();
	
		for(Account acount: accounts) {
			AccholderName.add(acount);
			
		}
		System.out.println(AccholderName);
		
	/*/	for(Account bal: balances) {
			Balance.add(bal);
			
		}/*/
		
		
		
	}

}
