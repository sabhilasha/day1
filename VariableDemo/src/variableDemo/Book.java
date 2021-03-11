package variableDemo;

public class Book {
	int a=0;//instance variable
	void m() {
		int b=20;
		int a=10;//local
		System.out.println(this.a);
		if(a==10) {
			b=30;//block level variable
		}
		System.out.println(b);
		
	}
	
public static void main(String[] args) {
	Book book =new Book();
	book.m();
}
}
