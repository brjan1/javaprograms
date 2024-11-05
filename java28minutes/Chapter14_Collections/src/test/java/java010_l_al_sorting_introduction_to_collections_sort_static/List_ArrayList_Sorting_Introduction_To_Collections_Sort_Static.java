package java010_l_al_sorting_introduction_to_collections_sort_static;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_ArrayList_Sorting_Introduction_To_Collections_Sort_Static {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(123, 12, 3, 45);
		System.out.println(numbers);
		
		List<Integer> numbersAl = new ArrayList<>(numbers);
		System.out.println(numbersAl);
		Collections.sort(numbersAl);
		System.out.println(numbersAl);
		

	}

}
