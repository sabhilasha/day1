
public class StringDemo {
	public static void main(String[] args) {
	    usingStringPool();
		withoutStringPool();
		usingStringBuilder();
		dataManipulation();
	
	}
	private static void dataManipulation() {
		String s1 = "IBM";
		System.out.println(s1);
		s1=s1.concat(", banglore");
		
		System.out.println(s1);
		
	}
	
	private static void usingStringBuilder() {
		StringBuilder s1 = new StringBuilder("IBM");
		StringBuilder s2 = new StringBuilder("IBM");
		System.out.println(s1 ==s2);
	}
	private static void withoutStringPool() {
		String s1 = new String("IBM");
		String s2 = new String("IBM");
		System.out.println(s1 ==s2);
		
	}
	private static void usingStringPool() {
	String s1 = "IBM";
	String s2 = "IBM";
	System.out.println(s1 ==s2);
	
	}
}
