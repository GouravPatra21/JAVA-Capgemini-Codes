package Problems_on_OOPs_4;

public class Student extends Person {
	private int studentId;
	public Student(String name, int age, int studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Student's Id:" + this.studentId);
	}
	public void studentGrade() {
		System.out.println("The students are in class 12");
	}

}
