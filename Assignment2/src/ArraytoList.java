import java.util.Arrays;
import java.util.List;
public class ArraytoList {
	public static void main(String[] args) {
		String[] AccholderName= {"ram","shyam","pran"};
		Integer[] balance= {200,3000,459};
		List<String> name =Arrays.asList(AccholderName);
		List<Integer> bal =Arrays.asList(balance);
		System.out.println(name);
		System.out.println(bal);
}}
