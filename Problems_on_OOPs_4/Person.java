package Problems_on_OOPs_4;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void displayInfo() {
		System.out.print("Person's Name:" + this.name + "Person's age: " + this.age + " ");
	}

}
