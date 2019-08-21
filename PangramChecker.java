package codingBatPractice;

import java.util.HashMap;

public class PangramChecker {


	HashMap<Character, Integer> Counter = new HashMap<Character, Integer>();

	public boolean isPangram(String input) {
		//second way of doing it without regex using hashmap
		String editString = input.toLowerCase().replaceAll("[^a-z]", "");
		char[] tempArray = editString.toCharArray();
	
		for (char c : tempArray) {
			if (Counter.containsKey(c)) {
				Counter.put(c, Counter.get(c) + 1);
			} else {
				Counter.put(c, 1);
			}
		}
		return Counter.size() == 26;
	}
}
