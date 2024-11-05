package chapter16_String_Characters_Programs;

public class StringBuilderConstructors {

	public static void main(String[] args) {
		
		StringBuilder builder1 = new StringBuilder();
		StringBuilder builder2 = new StringBuilder(10);
		StringBuilder builder3 = new StringBuilder("hello");
		
		System.out.println("builder1: " + builder1);
		System.out.println("builder2: " + builder2);
		System.out.println("builder3: " + builder3);

	}

}
