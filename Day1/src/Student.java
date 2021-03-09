
public class Student extends Human {
		byte age;
		
		void study() {
			System.out.println(getName()+" is studying");
		}
		
		
		public byte getAge() {
			return age;
		}
		public void setAge(byte age) {
			this.age = age;
		}
		Student(){//default construcator
			
		}
		Student(String name){//custom constructor
			setName(name);
		}
		Student(byte age){//custom constructor
			setAge(age);
		}
		

		
	}



