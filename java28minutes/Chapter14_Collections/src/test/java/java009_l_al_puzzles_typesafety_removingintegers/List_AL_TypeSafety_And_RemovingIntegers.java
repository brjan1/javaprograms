package java009_l_al_puzzles_typesafety_removingintegers;

import java.util.ArrayList;
import java.util.List;

public class List_AL_TypeSafety_And_RemovingIntegers {

	public static void main(String[] args) {
		
		List value = List.of("A", 'A', 1, 1.0);
		System.out.println(value);
		
		System.out.println("value.get(2): " + value.get(2));
		
		System.out.print("value.get(2) instanceOf Integer: ");
		System.out.println((value.get(2))instanceof Integer);
		
		/**
		 * Auto-Boxing
		 */
		
		System.out.print("value.get(1) instanceOf Integer: ");
		System.out.println((value.get(1))instanceof Character);
		
		System.out.print("value.get(3) instanceOf Integer: ");
		System.out.println((value.get(3))instanceof Double);
		
		System.out.print("value.get(0) instanceOf String: ");
		System.out.println((value.get(0))instanceof String);
		
		
		//List<String> value2 = List.of("A", 'A', 1, 1.0); //Error: ype mismatch: cannot convert from List<Object & Serializable & Comparable<?> & Constable> to List<String>

		System.out.println("--------------------------");
		List<Integer> numbers = List.of(101, 102, 103, 104, 105);
		System.out.println(numbers);
		System.out.println(numbers.indexOf(101));
		
		System.out.println("---------------------------");
		List<Integer> numbersAl = new ArrayList<>(numbers);
		System.out.println(numbersAl);
		System.out.println(numbersAl.indexOf(101));
		//System.out.println(numbersAl.remove(101)); //Index 101 out of bounds for length 5
		numbersAl.remove(Integer.valueOf(101));
		System.out.println(numbersAl);
		
	}

}
