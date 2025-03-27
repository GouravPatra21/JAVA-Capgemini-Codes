package Problems_on_OOPs_4;

public class Professor extends Person {
	private String specialisation;
	public Professor(String name, int age, String specialisation) {
		super(name, age);
		this.specialisation = specialisation;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Professor's Specialisation:" + this.specialisation);
	}
	public void designation() {
		System.out.println("The professors are of Science Department");
	}

}
