package chapter16_String_Characters_Programs;

public class StringBuilderMethods_charAt_setCharAt_getChars_reverse {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("hello there");
		
		System.out.println(builder.toString());
		System.out.println(builder.charAt(0));
		System.out.println(builder.charAt(4));
		
		char[] charArray = new char[builder.length()];
		builder.getChars(0, builder.length(), charArray, 0);
		System.out.println("The characters are: ");
		
		for(char chars : charArray) 
			System.out.print(chars);
		
		System.out.println();
		builder.setCharAt(0,'H');
		builder.setCharAt(6, 'T');
		System.out.println(builder.toString());
		
		builder.reverse();
		System.out.println(builder.toString());

	}

}
