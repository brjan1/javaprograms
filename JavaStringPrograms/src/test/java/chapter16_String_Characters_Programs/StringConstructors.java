package chapter16_String_Characters_Programs;

public class StringConstructors {

	public static void main(String[] args) {
		
		char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
		String s = new String("hello");
		
		//use String constructors
		String s1 = new String();
		String s2 = new String(s);
		String s3 = new String(charArray);
		String s4 = new String(charArray, 6, 3);
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);
		

	}

}
