package java003_listinterface_immutability_introofimplementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface_Immutability_IntroOfImplementation {
	
	public static void main(String[] args) {
		List<String> words = List.of("Apple", "Bat", "Cat");
		
		List<String> wordsArrayList = new ArrayList<String>(words);
		System.out.println("wordsArrayList: " + wordsArrayList);
		wordsArrayList.add("Giraffee");
		System.out.println("wordsArrayList: " + wordsArrayList);
		
		List<String> wordsLinkedList = new LinkedList<String>(words);
		System.out.println("wordsLinkedList: " + wordsLinkedList);
		wordsLinkedList.add("Lion");
		System.out.println("wordsLinkedList: " + wordsLinkedList);
		
		List<String> wordsVector = new Vector<String>(words);
		System.out.println("wordsVector: " + wordsVector);
		wordsVector.add("Dog");
		System.out.println("wordsVector: " + wordsVector);
	}

}
