package Exception_Handling_Day17;

public class ThrowsKeyword {
	public static void main(String[] args) {
		try {
			div(10, 2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void div(int x, int y) throws RuntimeException, ClassNotFoundException, Exception {
		System.out.println(x/y);
		Class.forName("demo");
	}

}
