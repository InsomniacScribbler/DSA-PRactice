package Arrays;

import java.util.*;
import java.math.BigInteger;

public class NextPalindrome {

	// Method to find the next largest palindrome
	public static String nextLargestPalindrome(String number, int length) {
		// Edge case for single digit numbers
		if (length == 1) {
			int n = Integer.parseInt(number);
			return String.valueOf(n + 1);
		}

		// Check for special case where all digits are 9
		if (allNines(number)) {
			// Manually constructing the string "100...001"
			StringBuilder sb = new StringBuilder();
			sb.append("1");
			for (int i = 0; i < length - 1; i++) {
				sb.append("0");
			}
			sb.append("1");
			return sb.toString();
		}

		// Split the number into two halves
		int halfLength = (length + 1) / 2; // Middle digit included if length is odd
		String leftHalf = number.substring(0, halfLength);
		String rightHalf = number.substring(length - halfLength);

		// Form a palindrome by reflecting the left half
		String potentialPalindrome = leftHalf + new StringBuilder(leftHalf.substring(0, length / 2)).reverse().toString();

		// If this palindrome is greater than the original number, return it
		if (potentialPalindrome.compareTo(number) > 0) {
			return potentialPalindrome;
		}

		// Otherwise, increment the left half and mirror again
		BigInteger leftHalfBig = new BigInteger(leftHalf);
		String newLeftHalf = leftHalfBig.add(BigInteger.ONE).toString();

		if (newLeftHalf.length() > leftHalf.length()) {
			// If the left half has increased in length, like "999" -> "1000"
			return newLeftHalf + new StringBuilder(newLeftHalf.substring(0, length / 2)).reverse().toString();
		}

		// Mirror the new left half
		return newLeftHalf + new StringBuilder(newLeftHalf.substring(0, length / 2)).reverse().toString();
	}

	// Helper method to check if the number consists entirely of 9's
	private static boolean allNines(String number) {
		for (char c : number.toCharArray()) {
			if (c != '9') {
				return false;
			}
		}
		return true;
	}

	// Main method to process multiple test cases
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();  // Read number of test cases
		sc.nextLine();  // Consume the newline character

		while (T-- > 0) {
			String number = sc.nextLine();
			int length = number.length();
			System.out.println(nextLargestPalindrome(number, length));
		}
		sc.close();
	}
}
