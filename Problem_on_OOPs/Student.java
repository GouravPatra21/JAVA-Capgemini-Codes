package Problem_on_OOPs;

public class Student extends Person {
	private int studentId;

//	public int getStudentId() {
//		return studentId;
//	}

//	public void setStudentId(int studentId) {   //No need of setters to assign values to private variables
//		this.studentId = studentId;
//	}
	public Student(String name, int age, int studentId) {
		super(name,age);
		this.studentId = studentId;
	}
//	void displayStudentDetails() {
//		System.out.println(this.getName() + " " + this.getAge() + " " + this.getStudentId());
//	}
//	void displayStudentDetails() {
//		displayPersonDetails();
//		System.out.println(this.studentId);
//	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println(" " + this.studentId);
	}

}
