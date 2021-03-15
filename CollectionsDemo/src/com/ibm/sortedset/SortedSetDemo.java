package com.ibm.sortedset;

import java.util.Set;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		for (int i=0; i <30;i++) {
			names.add("Ram");
			names.add("Ajay");
			names.add("ajay");
		}
		System.out.println(names);
	}

}
