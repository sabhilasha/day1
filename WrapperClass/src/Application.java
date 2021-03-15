import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		int a=1;//primitive data type 
		//a.
		Integer b=a; //autoboxing
		
		Float f = 45.78f;//non primitive or object (we can say) start with capital letter and fullword
		Double d = 23.4; 
		System.out.println(d.compareTo(33.4));
		double x = d;//autounboxing
		System.out.println(x);
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(29);
		System.out.println(numbers);
	}

}
