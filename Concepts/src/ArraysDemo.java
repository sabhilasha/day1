
public class ArraysDemo {
	public static void main(String[] args) {
		int[] scores = new int[10];
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		int[] numbers = {1,2,3,4};
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		boolean[] booleans = {true, false};
		for(int i=0;i<booleans.length;i++) {//this can be done in this way as well below way
			System.out.println(booleans[i]);
		}
		for(boolean value : booleans) {//for Each
			System.out.println(value);
		}
		String[] names = new String[10];// made array
		for (String name : names) {// for each name in names array 
			name = new String();// name is equal to new string
			name = "Ram";
			System.out.println(name);
		}
		Student[] students = new Student[10];
		for(int i=0;i<students.length;i++) {
			Student student = new Student("ram"+i);
			students[i]= student;
			if(i==5)
				break;
		}
		System.out.println("length"+ students.length);
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].getName());
		}
		//students[10]=new Student["Shyam"];
	}
}
class Student{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name=name;
	}
}
