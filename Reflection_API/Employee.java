package Reflection_API;

public class Employee{
	private int id;
	private String name;
	private double salary;
	private int age;
	Employee(int id, String name, double salary, int age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	@Deprecated
	public int getid() {
		return id;
	}
	@Deprecated
	public String getName() {
		return name;
	}
	@Deprecated
	public double getSalary() {
		return salary;
	}
	@Deprecated
	public int getage() {
		return age;
	}
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.salary+" "+this.age;
	}

}
