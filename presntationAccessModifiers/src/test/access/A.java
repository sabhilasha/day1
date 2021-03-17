package test.access;

public class A {
	 public void msg() {
		System.out.println("hello");
	}
 
}
public class Application{
	public static void main(String[] args) {
		A a= new A();
		a.msg();
	}
}
