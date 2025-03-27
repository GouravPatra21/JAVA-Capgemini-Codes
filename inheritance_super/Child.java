package inheritance_super;

public class Child extends Parent{
	public Child(String name, int age) {
//		super(name, age);
		super();
		this.name = name;
		this.age = age;
	}

}
