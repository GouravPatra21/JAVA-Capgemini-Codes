package StringBuffer;

public class GouravPatra {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append(false);
		sb1.append("hello");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("Hello World");
		System.out.println(sb2);
		
		sb2.delete(0, 4);
		System.out.println(sb2);
		System.out.println("-------------------------------------------------");
		
		char[] arr = {'a', 'b', 'c', 'd'};
		StringBuffer sb3 = new StringBuffer(150);
		sb3.append(arr);
		System.out.println(sb3);
		
		System.out.println(sb3.capacity());
		sb3.ensureCapacity(400);
		System.out.println(sb3.capacity());
		
		System.out.println(sb3.insert(1, false));
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer();
		sb4.append("hello");
		sb4.insert(4, arr, 1, 2);
		System.out.println(sb4);
		sb4.setCharAt(4, 'o');
		System.out.println(sb4);
		sb4.reverse();
		System.out.println(sb4);
		
//		conversion from StringBuilder to String
		String s = new String(sb4);
		System.out.println(s);
//		conversion from string to StringBuffer and StringBuilder
//		StringBuffer sb5 = new StringBuffer(s);
	
	}

}
