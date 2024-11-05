package java001_print_words_with_even_length;

public class PrintWordsWithEvenLength {

	public static void main(String[] args) {
		
		/**
		 * Java program to print all words with even length in the given string. Examples:

Input: s = "This is a java language"
Output: This
        is
        java
        language 

Input: s = "i am GFG"
Output: am
		 */
		
		String str = "I am Java Programmer";
		String[] words = str.split(" ");
		System.out.println(words.length);
		for(String word : words) {
			if(word.length() %2 ==0 ) {
				System.out.println(word);
			}
			
		}

	}

}
