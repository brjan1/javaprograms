package stringinput;

import java.util.Scanner;

public class StringInputDemo {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scr.nextLine();
		System.out.println(str);
		
		/**
		 * String program
		 */
		
		scr.close();

	}

}
