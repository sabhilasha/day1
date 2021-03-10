
public class OverloadingDemo {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.study();
		s1.study(1);
		s1.study(2,"maths");
	}
}
//same method name but different no. and type of arguement 
class Student1{
	public void study(int duration,String subject) {
		System.out.println("study"+duration+"hour"+subject);
	}

	public void study(int duration) {
		System.out.println("study"+duration+"hour");
	}
	
	public void study() {
	System.out.println("study");
}
}
