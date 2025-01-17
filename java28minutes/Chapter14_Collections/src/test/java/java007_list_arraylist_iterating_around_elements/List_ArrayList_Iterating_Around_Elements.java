package java007_list_arraylist_iterating_around_elements;

import java.util.Iterator;
import java.util.List;

public class List_ArrayList_Iterating_Around_Elements {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple", "Bat", "Cat");
		
		for(int i=0; i<words.size(); i++) {
			System.out.println(words.get(i));
		}
		System.out.println("-------------");
		
		for(String word : words) {
			System.out.println(word);
		}
		System.out.println("-------------");
		
		Iterator itr = words.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
