package chapter16_String_Characters_Programs;

import java.util.Scanner;

public class StaticCharMethods2_CharClass_Static_Conversion_Methods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//get radix
		System.out.println("Please enter a radix: ");
		int radix = scanner.nextInt();
		
		System.out.printf("Please choose one:\n1 --%s\n2 --%s\n", "Convert digit to character", "Convert character to digit");
		int choice = scanner.nextInt();
		
		//process request
		switch(choice) {
		case 1:
			System.out.println("Enter a digit: ");
			int digit = scanner.nextInt();
			System.out.println("Convert digit to character: " + Character.forDigit(digit, radix));
			break;
		case 2:
			System.out.println("Enter a character: ");
			char character = scanner.next().charAt(0);
			System.out.println("Convert character to digit: " + Character.digit(character, radix));
			break;
		}

	}

}
