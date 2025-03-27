package Problem_on_OOPs;

public class Person {
	private String name;
	private int age;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {   //No need of setters to assign values to private variables
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {    //No need of setters to assign values to private variables
//		this.age = age;
//	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	public void displayPersonDetails() {
//		System.out.println(this.getName() + " " + this.getAge());
//	}
//	public void displayPersonDetails() {
//		System.out.println(this.name + " " + this.age);
//	}
	public void displayDetails() {
		System.out.print(this.name + " " + this.age);
	}
	
	
	

}
