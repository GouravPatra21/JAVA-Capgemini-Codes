package practice;
import java.util.Scanner;
public class RemoveDuplicateElementsBasicApproach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		char[] charArray = input.toCharArray();
		int newLength = removeDuplicates(charArray);
		for(int i = 0; i < newLength; i++) {
			System.out.print(charArray[i]);
		}
	}
	public static int removeDuplicates(char[] chars) {
		int n = chars.length;
		int index = 0;
		for(int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			for(int j = 0; j < index; j++) {
				if(chars[i] == chars[j]) {
					isDuplicate = true;
					break;
					
				}
			}
			if(!isDuplicate) {
				chars[index] = chars[i];
				index++;
			}
		}
		return index;
	}

}
