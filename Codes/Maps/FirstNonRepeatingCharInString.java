package Maps;

import java.util.*;

public class FirstNonRepeatingCharInString {

	public static char firstNonRepeatingCharacter(String str) {
		// LinkedHashMap to maintain order of insertion
		LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<>();

		// Step 1: Count frequency of each character
		for (char ch : str.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
		}

		// Step 2: Find the first character with frequency 1
		for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		// Step 3: If no unique character found, return first character of string
		return str.charAt(0);
	}

	public static void main(String[] args) {
		// Sample test inputs
		String[] inputs = {
				"aDcadhc",   // Expected output: D
				"AabBcC",    // Expected output: A
				"ABcd",      // Expected output: A
				"AAAbcdb"    // Expected output: c
		};

		for (String testCase : inputs) {
			System.out.println("First non-repeating character in \"" + testCase + "\" is: " +
					firstNonRepeatingCharacter(testCase));
		}
	}
}

