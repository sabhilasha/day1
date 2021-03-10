package dataConversion;

public class DataDemo {
	public static void main(String[] args) {
		int a=20; //4 bytes
		long long1 = a; //8bytes
		System.out.println(long1);
		byte byte1 = (byte) a; //1byte  dangerous when the value of a is more then 127 or less then -128
		System.out.println(byte1);
		
	}

}
