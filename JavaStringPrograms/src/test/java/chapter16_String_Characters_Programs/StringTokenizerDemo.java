package chapter16_String_Characters_Programs;

import java.util.Scanner;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		//get sentence
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter a sentence and press enter: ");
		String sentence = scanner.nextLine();
		
		//process user sentence
		String[] tokens = sentence.split(" ");
		System.out.printf("Number of elements: %d\nThe tokens are:\n", tokens.length);
		
		for(String token : tokens)
			System.out.println(token);

	}

}
