package chapter16_String_Characters_Programs;

public class StringBuilder_append_methods {

	public static void main(String[] args) {
		
		Object objectRef = "hello";
		String string = "goodbye";
		char[] charArray = {'a', 'b','c', 'd', 'e', 'f'};
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 10000000000L;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
		
		StringBuilder lastBuilder = new StringBuilder("last builder");
		StringBuilder builder = new StringBuilder();
		
		builder.append(objectRef);
		builder.append("\n");
		builder.append(string);
		builder.append("\n");
		builder.append(charArray);
		builder.append("\n");
		builder.append(booleanValue);
		builder.append("\n");
		builder.append(characterValue);
		builder.append("\n");
		builder.append(integerValue);
		builder.append("\n");
		builder.append(longValue);
		builder.append("\n");
		builder.append(floatValue);
		builder.append("\n");
		builder.append(doubleValue);
		
		
		System.out.println("builder contains: " + builder);
		

	}

}
