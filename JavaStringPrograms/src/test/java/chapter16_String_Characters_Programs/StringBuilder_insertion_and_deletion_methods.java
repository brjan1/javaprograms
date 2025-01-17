package chapter16_String_Characters_Programs;

public class StringBuilder_insertion_and_deletion_methods {

	public static void main(String[] args) {
		
		Object objectRef = "hello";
		String string = "goodbye";
		char[] charArray = {'a', 'b','c', 'd', 'e', 'f'};
		boolean booleanValue = true;
		char characterValue = 'K';
		int integerValue = 7;
		long longValue = 10000000000L;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
		
		StringBuilder builder = new StringBuilder();
		
		builder.insert(0, objectRef);
		builder.insert(0, "  ");
		builder.insert(0, string);
		
		builder.insert(0, "  ");
		builder.insert(0, charArray);
		builder.insert(0, "  ");
		builder.insert(0, booleanValue);
		builder.insert(0, "  ");
		builder.insert(0, characterValue);
		builder.insert(0, "  ");
		builder.insert(0, integerValue);
		builder.insert(0, "  ");
		builder.insert(0, longValue);
		builder.insert(0, "  ");
		builder.insert(0, floatValue);
		builder.insert(0, "  ");
		builder.insert(0, doubleValue);
		
		System.out.println("builder after inserts : " + builder.toString());
		
		builder.deleteCharAt(10);
		builder.delete(2, 6);
		System.out.println("builder after deletes: " + builder.toString());

	}

}
