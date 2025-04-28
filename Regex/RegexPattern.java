package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
	public static void main(String[] args) {
//		String str = "Hello World\n today is 22";
//		String regex = ".";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(str);
//		while(matcher.find()) {
//			System.out.print(matcher.group());
//		}
		
//		String str2 = "This is a good Day, be good cacey";
//		String regex = "[abc]";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(str2);
//		while(matcher.find()) {
//			System.out.print(matcher.group());
//		}
		
//		String str3 = "This is a good Day, be good Caecy 17";
//		String regex = "[^abc]";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(str3);
//		while(matcher.find()) {
//			System.out.print(matcher.group());
//		}
	    //[a-z] ------>
//		String str4 = "This is a good Day, be good CAECY 17";
//		String regex = "[a-z]";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(str4);
//		while(matcher.find()) {
//			System.out.print(matcher.group());
//		}
//		
		// \d --->
//		String str5 = "This is a good Day, be good CAECY 17";
//		String regex = "[a-z\\d]";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(str5);
//		while(matcher.find()) {
//			System.out.print(matcher.group());
//		}
		
        // \w -->
//		String str6 = "This is a good Day, be good CAECY 17";
//		String regex = "\\w";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(str6);
//		while(matcher.find()) {
//			System.out.print(matcher.group());
//		}
		
//		// \s -->
//		String str7 = "This is a good Day, be good CAECY 17";
//		String regex = "[\\w\\s,]";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(str7);
//		while(matcher.find()) {
//			System.out.print(matcher.group());
//		}
		
		//
//		String str8 = "23This is a 26 good Day, be good CAECY 17";
//		String regex = "^23";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(str8);
//		while(matcher.find()) {
//			System.out.print(matcher.group());
//		}
		
		// a* ---->
		String s = "adam plucked the apple and gave it io aaron";
		String s1 = "this is rom";
//		String regex = "a*";
//		String regex = "a+";
//		String regex = "a?";
		String str = "This is a good world";
//		String regex = "s$";
		String str2  = "aaa is a aaaa aaa";
//		String regex = "a{3}";
		String regex = "a{2,4}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str2);
//		System.out.println(matcher.find());
		if(matcher.find()) {
			System.out.println(matcher.group());
		}
		
//		while(matcher.find()) {
//			System.out.println("$");
//			System.out.print(matcher.group());
//		}
//		System.out.println("end");
		
	}

}
