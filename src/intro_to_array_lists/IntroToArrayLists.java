package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> phrases = new ArrayList<String>();
		// 2. Add five Strings to your list
		phrases.add("Hello.");
		phrases.add("Is this thing on?");
		phrases.add("I like spaghetti.");
		phrases.add("I don't like fourtnoyght.");
		phrases.add("What do you like?");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < phrases.size(); i++) {
			String s = phrases.get(i);
			System.out.println(s);
		}
		// 4. Print all the Strings using a for-each loop
		for (String sentence : phrases) {
			System.out.println(sentence);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < phrases.size(); i++) {
			String s = phrases.get(i);
			if (i % 2 == 0) {
				System.out.println(s);
			}
		}
		// 6. Print all the Strings in reverse order.
		for (int i = phrases.size() - 1; i > -1; i--) {
			String s = phrases.get(i);
			System.out.println(s);
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < phrases.size(); i++) {
			String s = phrases.get(i);
			if(s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
