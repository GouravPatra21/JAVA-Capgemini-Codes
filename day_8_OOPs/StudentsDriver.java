package day_8_OOPs;

public class StudentsDriver {
	public static void main(String[] args) {
//		Student s1 = new Student(1, "Raj", "UEM", 56.54);
//		System.out.println(s1.name + " " + s1.collegeName + " " + s1.id + " " + s1.marks);
		Student s1 = new Student(5, "Sam");
		System.out.println(s1.name + " " + s1.id);
		Student s3 = new Student(5, "Ram", "IEM");
		System.out.println(s3.name + " " + s3.id + " " +  s3.collegeName);
		Student s2 = new Student(2, "Raj", "IEM", 89.45);
		System.out.println(s2.name + " " + s2.collegeName + " " + s2.id + " " + s2.marks);
		
//		s1.name = "Raj";
//		s1.collegeName = "UEM";
//		s1.id = 1;
//		s1.marks = 89.67;
//		
//		System.out.println(s1.collegeName + " " + s1.id + " " + s1.marks + " " + s1.name);
//		s1.study();
//		
//		System.out.println("..............................................................");
//		Student s2 = new Student();
//		s2.name = "Sam";
//		s2.collegeName = "UEM";
//		s2.id = 3;
//		s2.marks = 77.23;
//		
//		System.out.println(s2.collegeName + " " + s2.id + " " + s2.marks + " " + s2.name);
//		s2.study();
		
		
	}

}
