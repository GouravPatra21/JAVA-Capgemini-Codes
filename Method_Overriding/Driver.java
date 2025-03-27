package Method_Overriding;

public class Driver {
	public static void main(String[] args) {
//		Dog d = new Dog();
//		d.sound();
//		Tiger t = new Tiger();
//		t.sound();
		Animal dog = new Dog("Siberian Husky"); // upcasting
		dog.sound();
		dog.greet(); //static method it will print the greet method of animal
//		String dogBreed = ((Dog)dog).breed; // downcasting
//		System.out.println(dogBreed);
//		Dog c = new Dog("ghhh");
//		System.out.println(c.breed);
//		System.out.println(".............................................");
//		Animal tiger = new Tiger();
//		tiger.sound();

	}

}
