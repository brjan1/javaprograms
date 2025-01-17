package chapter16_String_Characters_Programs;

public class String_valueOf_methods {

	public static void main(String[] args) {
		
		char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
		boolean booleanValue = true;
		char characterValue = 'z';
		int integerValue = 7;
		long longValue = 10000000000L;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
		Object objectRef = "hello";
		
		System.out.println("String.valueOf(charArray): " + String.valueOf(charArray));
		System.out.println("String.valueOf(charArray, 3, 3): " + String.valueOf(charArray, 3, 3));
		System.out.println(String.valueOf(booleanValue));
		System.out.println(String.valueOf(characterValue));
		System.out.println(String.valueOf(integerValue));
		System.out.println(String.valueOf(longValue));
		System.out.println(String.valueOf(floatValue));
		System.out.println(String.valueOf(doubleValue));
		System.out.println(String.valueOf(objectRef));

	}

}
