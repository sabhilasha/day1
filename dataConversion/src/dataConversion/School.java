package dataConversion;

public class School {
	public static void main(String[] args) {
		Human s1 = new Student("Ram");
		s1.eat();
		((Human)s1).eat();
	}

}
