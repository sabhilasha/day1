package com.ibm;

import test.A;

public class B extends A {
	protected int age = 10;//shadowing
	/*/void m1(){
		
	System.out.println(age);
	
	}/*/
	void m2(){
		System.out.println(age);
	}

}
