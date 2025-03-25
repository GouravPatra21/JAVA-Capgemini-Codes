package one_to_many;
import java.util.Scanner;
public class DriverPost {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of post");
		int size = sc.nextInt();
		User user = new User(size, "Gourav Patra");
		boolean flag = true;
		while(flag) {
			System.out.println("Ente 1 to add post\nEneter 2 to display posts" + "\nEnter 3 to exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Ente your Poster Id");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Post name");
				String name = sc.nextLine();
				Post post = new Post(id, name);
				user.addPost(post);
				
			case 2:
				user.displayPosts();
				break;
			case 3:
				flag = false;
				break;
			}
		}
		sc.close();
	}
}
