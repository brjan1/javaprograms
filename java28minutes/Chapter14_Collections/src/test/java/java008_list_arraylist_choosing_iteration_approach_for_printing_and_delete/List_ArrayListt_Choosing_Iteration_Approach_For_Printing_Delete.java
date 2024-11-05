package java008_list_arraylist_choosing_iteration_approach_for_printing_and_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ArrayListt_Choosing_Iteration_Approach_For_Printing_Delete {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple", "Bat", "Cat");
		
		List<String> wordsAl = new ArrayList<>(words);
		
		for(String word:words) {
			if(word.endsWith("at")) {
				System.out.println(word);
			}
		}
		
		System.out.println("-----------");
		System.out.println("wordsAl: " + wordsAl);
		for(String word:wordsAl) {
			if(word.endsWith("at")) {
				wordsAl.remove(word);
			}
		}
		System.out.println("deletion by using for loop: " + wordsAl); //output: [Apple, Cat]
		
		System.out.println("-------------");
		
		List<String> wordsAl2 = new ArrayList<>(words);
		System.out.println("wordsAl2: " + wordsAl2);
		
		Iterator<String> itr = wordsAl2.iterator();
		while(itr.hasNext()) {
			if(itr.next().endsWith("at")) {
				itr.remove();
			}
		}
		System.out.println("deletion by using iterator: " + wordsAl2);

	}

}
