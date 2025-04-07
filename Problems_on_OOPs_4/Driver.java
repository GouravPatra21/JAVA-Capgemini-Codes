package Problems_on_OOPs_4;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of person present in university");
		int size = sc.nextInt();
		University unv = new University(size);
		boolean flag = true;
		while(flag) {
			System.out.println("Enter 1 to add Person if Student:");
			System.out.println("Enter 2 to add Person if Professor:");
			System.out.println("Enter 3 to display every Person:");
			System.out.println("Enter 4 to exit:");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			sc.nextLine();
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
				Person student = new Student(name, age, studentId);
				unv.addPerson(student);
				break;
				
				
			case 2:
				System.out.println("Enter your Professor name");
				String name2 = sc.nextLine();
				System.out.println("Enter your age");
				int age2 = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your specialisaton");
				String specialisation = sc.nextLine();
				Person professor = new Professor(name2, age2, specialisation);
				unv.addPerson(professor);
				break;
				
			case 3:
				unv.showPeople();
				break;
				
				
			case 4:
				flag = false;
				System.out.println("Exited from the code Succesfully");
				break;
				
				
			}
			
		}
		sc.close();
		
	}

}
