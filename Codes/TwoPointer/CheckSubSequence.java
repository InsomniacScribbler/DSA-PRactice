package TwoPointer;

public class CheckSubSequence {

	// Function to check if s1 is a subsequence of s2
	public static boolean isSubsequence(String s1, String s2) {
		int i = 0, j = 0;

		// Traverse both strings
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) == s2.charAt(j)) {
				i++; // move in s1 if match found
			}
			j++; // always move in s2
		}

		// If we traversed all characters of s1, it's a subsequence
		return i == s1.length();
	}

	public static void main(String[] args) {
		// Hardcoded input strings
		String s1 = "abc";
		String s2 = "aebdc";

		// Check and print result
		if (isSubsequence(s1, s2)) {
			System.out.println(s1 + " is a subsequence of " + s2);
		} else {
			System.out.println(s1 + " is NOT a subsequence of " + s2);
		}
	}
}
