
public class EBH204 {
	static boolean m1(String s, boolean b) {
		System.out.print(s + (b ? "T" : "F"));
		return b;
	}
	public static void main(String[] args) {
		m1("A",m1("B",false) || m1("C",true) || m1("D",false));
		
	}
}
