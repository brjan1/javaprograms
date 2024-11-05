package chapter16_String_Characters_Programs;

public class ExtractingSubstringsFromStrings {

	public static void main(String[] args) {
		
		String letters = "abcdefghijklmabcdefghijklm";
		
		//test substring methods
		System.out.println("substring from index 20 to end is : " + letters.substring(20));
		System.out.println("substring from index 3 upto, but not including 6 is : " + letters.substring(3, 6));

	}

}
