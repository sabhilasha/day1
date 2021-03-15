package com.ibm.treemap;

import java.util.Map;
import java.util.TreeMap;


public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String,String> accounts = new TreeMap<String,String>();
		accounts.put("-2","account2");
		accounts.put("1","account1");
		accounts.put("-1","account-1");
		System.out.println(accounts);
		
	}

}
