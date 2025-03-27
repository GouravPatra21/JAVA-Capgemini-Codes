package Method_Overriding;

public class Dog extends Animal {
	String breed;
	public Dog(String breed) { // variable which belong to dog class only
		this.breed = breed;
	}
	public void sound() { // method overriding
		System.out.println("Dog is barking");
	}
	static void greet() {
		System.out.println("Dog is greeting you");
	}
}
