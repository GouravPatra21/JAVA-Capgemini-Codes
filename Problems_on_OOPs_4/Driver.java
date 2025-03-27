package Problems_on_OOPs_4;

import java.util.Scanner;

import one_to_many.Customer;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of person present in university");
		int size = sc.nextInt();
		University unv = new University(size);
		boolean flag = true;
		while(flag) {
			System.out.println("Enter 1 to add Person if Proffesor:");
			System.out.println("Enter 2 to add Person if Student:");
			System.out.println("Enter 3 to display every Person:");
			System.out.println("Enter 4 to exit:");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter your student name");
				String name = sc.nextLine();
				System.out.println("Enter your age");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your student Id");
				int studentId = sc.nextInt();
				sc.nextLine();
				Person p = new Student(name, age, studentId);
				unv.addPerson(p);
				
				
			case 2:
				System.out.println("Enter your student name");
				String name2 = sc.nextLine();
				System.out.println("Enter your age");
				int age2 = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your specialisaton");
				String specialisation = sc.nextLine();
				sc.nextLine();
				Person c = new Professor(name2, age2, specialisation);
				unv.addPerson(c);
				
			case 3:
				Person g = new Student("jhbdjchvs", 25, 6564);
				g.displayInfo();
				((Student)g).studentGrade();
				Person f= new Professor("jsdnckjs", 26, "ksndns");
				f.displayInfo();
				((Professor)f).designation();
				
			case 4:
				flag = false;
				break;
				
				
			}
			
		}
		sc.close();
		
	}

}
