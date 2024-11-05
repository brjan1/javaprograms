package java002_listinterface_introduction_positionisking;

import java.util.List;

public class ListInterfaceIntroduction {
	
	/**
	 * List
	 * 1. cares about which position each object is in
	 * 2. elements can be added in by specifying position - where should it be added in
	 * 3. if element is added without specifying position - it is added at the end
	 */
	
	public static void main(String[] args) {
		List<String> words = List.of("Apple", "Bat", "Cat");
		System.out.println("words.size(): " + words.size());
		System.out.println("words.isEmpty(): " + words.isEmpty());
		System.out.println("words: " + words);
		System.out.println("words.get(0): " + words.get(0));
		System.out.println("words.contains(\"Cat\"): " + words.contains("Cat"));
		System.out.println("words.indexOf(\"Dog\"): " + words.indexOf("Dog"));
		System.out.println("words.indexOf(\"Apple\"): " + words.indexOf("Apple"));
		/*  // all mutating methods throw UnsupportedOperationException
		words.add("Rat");
		System.out.println("words: " + words);
		*/
		/* // all mutating methods throw UnsupportedOperationException
		words.remove(0);
		System.out.println("words: " + words);
		*/
	}
	

}
