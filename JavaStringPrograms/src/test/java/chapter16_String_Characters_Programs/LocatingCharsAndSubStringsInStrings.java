package chapter16_String_Characters_Programs;

public class LocatingCharsAndSubStringsInStrings {

	public static void main(String[] args) {
		
		String letters = "abcdefghijklmabcdefghijklm";
		
		//test indexOf to locate a character in a string
		System.out.println(letters.indexOf('c'));
		System.out.println(letters.indexOf('a', 1));
		System.out.println(letters.indexOf('$'));
		
		//test indexOf to locate a substring in a string
		System.out.println("def is located at index: " + letters.indexOf("def"));
		System.out.println("def is located at index: " + letters.indexOf("def", 7));
		System.out.println("hello is located at index: " + letters.indexOf("hello"));

		//test lastIndexOf to find a substring in a string
		System.out.println("last def is located at index: " + letters.lastIndexOf("def"));
		System.out.println("last def is located at index: " + letters.lastIndexOf("def", 25));
		System.out.println("last hello is located at index: " + letters.lastIndexOf("hello"));
		
	}

}
