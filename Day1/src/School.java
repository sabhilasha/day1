
public class School {
	public static void main(String[] args) {
		printPattern();
	}
		public static void printPattern() {
			for(int i=0 ;i<5;i++) {
				for(int j=0;j<i+1;j++) {
					System.out.println("*");
				}
				System.out.println("");
				
			}
		}

		
		/*/{void practice() {
			for(int i=0 ;i<10;i++) {
				Teacher teach = new Teacher("Shyam"+i);
		}
			int i=0;
			while(i<10) {
				Teacher teach = new Teacher("Shyam"+i);
				i++;
				
			}
			
		}}/*/
		
		void studentDiscussion(){
			System.out.println("Hello");
			Student student = new Student("ram");
			//student.setName(""); avoid//
			student.setAge((byte)10);
			System.out.println("Name="+student.getName());
			System.out.println(student.getAge());
			student.study();
		}
				
	}
	
