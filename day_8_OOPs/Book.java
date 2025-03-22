package day_8_OOPs;


public class Book {
	String title = "GOT";
	String author = "GRR Martin";
	int price = 2000;
	public void reading() {
		System.out.println("Reading book");
	}
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		b2.price = 3000;
		System.out.println(b2.price);
	}

}
