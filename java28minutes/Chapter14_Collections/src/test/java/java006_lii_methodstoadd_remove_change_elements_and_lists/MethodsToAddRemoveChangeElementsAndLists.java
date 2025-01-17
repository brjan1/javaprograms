package java006_lii_methodstoadd_remove_change_elements_and_lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MethodsToAddRemoveChangeElementsAndLists {
	
	public static void main(String[] args) {
		
        List<String> words = List.of("Apple", "Bat", "Cat");
		
		List<String> wordsArrayList = new ArrayList<String>(words);
		wordsArrayList.add("Elephant");
		wordsArrayList.add(2, "Ball");
		System.out.println(wordsArrayList);
		wordsArrayList.add("Ball");
		System.out.println(wordsArrayList);
		
		System.out.println("--------------------------");
		List<String> newList = List.of("Yak", "Zebra");
		System.out.println(newList);
		
		wordsArrayList.addAll(newList);
		System.out.println(wordsArrayList);
		
		wordsArrayList.set(5, "Fish");
		System.out.println(wordsArrayList);
		
		wordsArrayList.remove(2);
		System.out.println(wordsArrayList);
		
		System.out.println(wordsArrayList.remove("Bat"));
		System.out.println(wordsArrayList);
		
		System.out.println(wordsArrayList.remove("Bat"));
		
		
		
		
	}

}
