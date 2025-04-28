package List;

public class Student implements Comparable<Student> {
	int id;
	String name;
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return this.id + " " + this.name;
	}
	@Override
	public int compareTo(Student s ) {
		// TODO Auto-generated method s
		return this.id - s.id;
	}

}
