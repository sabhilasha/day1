import java.util.Date;
public class DateClass {
	public static void main(String[] args) {
		Date date1 = new Date(2021,03,10);
		System.out.println(date1.getDate());
		System.out.println(date1.getDay());
		System.out.println(date1.getMonth());
		System.out.println(date1.getYear());
		
		Date date2 = new Date(2021,3,30);
		Date date3 = new Date();
		System.out.println(date1==date2);
		System.out.println(date1.equals(date2));
		System.out.println(date1.equals(date3));
		
	}

}
