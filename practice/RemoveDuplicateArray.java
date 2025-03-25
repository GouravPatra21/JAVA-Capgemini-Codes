package practice;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicateArray {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	char[] charArray = input.toCharArray();
	Set<Character> charSet = new LinkedHashSet<>();
	for(char c : charArray) {
		charSet.add(c);
	}
	char[] resultArray = new char[charSet.size()];
	int index = 0;
	
	for(char c : charSet) {
		resultArray[index++] = c;
	}
	System.out.println(new String(resultArray));
	}

}
