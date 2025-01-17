package chapter16_String_Characters_Programs;

public class StringMethods_replace_toLowerCase_toUpperCase_trim_toCharArray {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "GOODBYE";
		String s3 = "   spaces   ";
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		
		//test replace method
		System.out.println("replace 'l' with 'L' in s1 : " + s1.replace('l', 'L'));
		
		//test toLowerCase and toUpperCase
		System.out.println("s1.toUpperCase(): " + s1.toUpperCase());
		System.out.println("s2.toLowerCase(): " + s2.toLowerCase());
		
		//test trim method
		System.out.println("s3 after trim : " + s3.trim());
		
		//test toCharArray method
		char[] charArray = s1.toCharArray();
		System.out.println("s1 as character array : ");
		for(char chars : charArray)
			System.out.print(chars);

	}

}
