package chapter16_String_Characters_Programs;

import java.util.Scanner;

public class StaticCharMethodsForTestingCharsAndConvertingCase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character and press enter: ");
		String input = scanner.next();
		char c = input.charAt(0);
		scanner.close();
		
		//display character info
		System.out.println("is defined: " + Character.isDefined(c));
		System.out.println("is digit: " + Character.isDigit(c));
		System.out.println("Character.isJavaIdentifierStart(c): " + Character.isJavaIdentifierStart(c));
		System.out.println("Character.isJavaIdentifierPart(c): " + Character.isJavaIdentifierPart(c));
		System.out.println("Character.isLetter(c): " + Character.isLetter(c));
		System.out.println("Character.isLetterOrDigit(c): " + Character.isLetterOrDigit(c));
		System.out.println("Character.isUpperCase(c): " + Character.isUpperCase(c));
		System.out.println("Character.isLowerCase(c): " + Character.isLowerCase(c));
		System.out.println("Character.toUpperCase(c): " + Character.toUpperCase(c));
		System.out.println("Character.toLowerCase(c): " + Character.toLowerCase(c));

	}

}
