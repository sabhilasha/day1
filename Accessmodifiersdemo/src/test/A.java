package test;

public class A {
	public int age=20; //shadowing age n child class will shadow age in parent class
	public void m1() {
		System.out.println("super class");
	}
}
