package chapter16_String_Characters_Programs;

public class StringBuilderMethods_length_capacity_setLength_ensureCapacity {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("Hello, how are you?");
		
		System.out.println(builder.toString());
		System.out.println(builder.length());
		System.out.println(builder.capacity());
		
		builder.ensureCapacity(75);
		System.out.println(builder.capacity());
		
		builder.setLength(10);
		System.out.println(builder.length());
		System.out.println(builder.toString());

	}

}
