package chapter16_String_Characters_Programs;

public class StringStartEnd {

	public static void main(String[] args) {
		
		String[] strings = {"started", "starting", "ended", "ending"};
		
		//test method startsWith
		for(String str : strings) {
			if(str.startsWith("st"))
				System.out.println(str);
		}
		
		System.out.println("--------");
		
		//test method startsWith starting from position 2 of string
		for(String str : strings) {
			if(str.startsWith("art", 2))
				System.out.println(str);
		}
		
System.out.println("--------");
		
		//test method startsWith starting from position 2 of string
		for(String str : strings) {
			if(str.startsWith("ti", 4))
				System.out.println(str);
		}
		
		System.out.println("--------");
		
		//test method endsWith
		for(String str : strings) {
			if(str.endsWith("ed"))
				System.out.println(str);
		}

	}

}
