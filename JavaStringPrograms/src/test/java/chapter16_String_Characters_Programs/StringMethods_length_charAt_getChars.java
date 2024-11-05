package chapter16_String_Characters_Programs;

public class StringMethods_length_charAt_getChars {

	public static void main(String[] args) {
		
		String s1 = "hello there";
		char[] charArray = new char[5];
		System.out.println("s1 : " + s1);
		
		//test length method
		System.out.println(s1.length());
		
		//loop through characters in s1 with charAt and display reversed
		System.out.print("The string reversed is: ");
		for(int count=s1.length()-1; count>=0; count--) {
			System.out.print(s1.charAt(count));
		}
		System.out.println();
		//copy characters from string into charArray
		s1.getChars(0, 5, charArray, 0);
		System.out.print("the character array is: ");
		
		for(char character : charArray) {
			System.out.print(character);
		}
		

	}

}
