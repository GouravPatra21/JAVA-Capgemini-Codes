package day_8_OOPs;

public class Student {
	int id;
	String name;
	double marks;
	String collegeName;
	public Student() {
		System.out.println("This is no arg constructor");
		
	}
	public Student(int id) {
		this();
		this.id = id;
		System.out.println("one arg constructor");
	}
	public Student(int id, String name) {
//		this.id = id;
		this(id);
		this.name = name;
		System.out.println("two arg constructor");
	}
	public Student(int id, String name, String collegeName) {
//		this.id = id;
//		this.name = name;
		this(id, name);
		this.collegeName = collegeName;
		System.out.println("three arg constructor");
	}
	public Student(int id, String name, String collegeName, double marks) {
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
		this.marks  = marks;
		System.out.println("Four arg constructor");
	}
	public void study() {
		System.out.println(name + " is Studying in UEM College");
	}

}
//int id = 55;
//String name = "Gourav Patra";
//double marks = 85;
//String collegeName = "UEM";