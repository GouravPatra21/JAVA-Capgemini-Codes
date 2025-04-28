package StreamPractice;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class StreamQuestions {
	public static void main(String[] args) {
		//Average of a list of integers
		System.out.println("Average of a list of integers");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		double sum = numbers.stream().reduce(0, (a,b) -> a+b);
		long count = numbers.stream().count();
		double average = count > 0 ? (double) sum/count : 0.0;
		System.out.println("Average: " + average);
		System.out.println("------------------------");
		
		//Convert a list of Strings to UpperCase or LowerCase using Streams
		System.out.println("Convert a list of Strings to UpperCase or LowerCase");
		List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Guava", "Grapes");
		
		List<String> UpperWords = words.stream().map(String::toUpperCase).toList();   //using method reference
		List<String> LowerWords = words.stream().map(s -> s.toLowerCase()).toList();   //using lambda Expressions
		System.out.println(UpperWords);
		System.out.println(LowerWords);
		
		// Lambda expressions for case conversion
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Choose conversion:");
//        System.out.println("1. Uppercase");
//        System.out.println("2. Lowercase");
//        System.out.print("Enter your choice (1 or 2): ");
//        
//        int choice = scanner.nextInt();
//        
//        // Select conversion function based on user choice
//        Function<String, String> converter = choice == 1 ? s -> s.toUpperCase() : s -> s.toLowerCase();
//        String conversionType = choice == 1 ? "Uppercase" : "Lowercase";
//        
//        // Apply the selected conversion
//        List<String> convertedWords = words.stream()
//                                         .map(converter)
//                                         .toList();
//        
//        System.out.println(conversionType + ": " + convertedWords);
		System.out.println("-----------------------------------");
		
		//sum of all even, odd numbers in a list
		System.out.println("Sum of all even, odd numbers in a list");
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Sum of Even nos" + num.stream().filter(n -> n%2 == 0).mapToInt(Integer::intValue).sum());
		System.out.println("Sum of Odd nos" + num.stream().filter(n -> n%2 != 0).mapToInt(Integer::intValue).sum());
		
//		Scanner scanner = new Scanner(System.in);
//        System.out.println("Choose which numbers to sum:");
//        System.out.println("1. Even numbers");
//        System.out.println("2. Odd numbers");
//        System.out.print("Enter your choice (1 or 2): ");
//        
//        int choice = scanner.nextInt();
//        
//        int sum1 = num.stream()
//                        .filter(n -> choice == 1 ? n % 2 == 0 : n % 2 != 0)
//                        .mapToInt(Integer::intValue)
//                        .sum();
//        
//        String numberType = choice == 1 ? "even" : "odd";
//        System.out.println("Sum of all " + numberType + " numbers: " + sum1);
		System.out.println("---------------------------");
		
		//remove all duplicate elements from a list using streams.
		System.out.println("remove all duplicate elements from a list using streams.");
		List<Integer> no = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,8,2, 1, 9);
		no.stream().distinct().forEach(n -> System.out.print(n + " "));
	}

}
