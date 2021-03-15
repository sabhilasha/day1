package dataConversion;
class Student extends Human{
	public Student(String name) {//constructor
		this.name=name;
	}
	void eat() {//overrides
		//super.eat();
		System.out.println("Student eats");
	}
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAge() {
		return (byte) age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}