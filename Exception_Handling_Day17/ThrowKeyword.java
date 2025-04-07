package Exception_Handling_Day17;

public class ThrowKeyword {
//	public static void div(int x, int y) {
//		if(y!=0) {
//			System.out.println(x/y);
//		}
//		else {
//			throw new ArithmeticException("Denominator is Zero");
//		}
//	}
	public static void div(int x, int y) throws Exception{
		if(y!=0) {
			System.out.println(x/y);
		}
		else {
			throw new Exception("Denominator is Zero");
		}
	}
	public static void main(String[] args) {
		try {
			div(10, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("main end");
	}

}
