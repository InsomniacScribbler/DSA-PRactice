package Arrays;

import java.util.Scanner;

public class BeautifulString {

	// Method to calculate the minimum operations to make the string beautiful
	public static int makeBeautiful(String str) {
		int n = str.length();
		int count0 = 0, count1 = 0;

		// Loop through the string and check each character
		for (int i = 0; i < n; i++) {
			// If we are at an even index, it should be '0' for beautiful1 and '1' for beautiful2
			if (i % 2 == 0) {
				if (str.charAt(i) != '0') {
					count0++; // Mismatch with beautiful1 (starting with '0')
				}
				if (str.charAt(i) != '1') {
					count1++; // Mismatch with beautiful2 (starting with '1')
				}
			} else { // Odd index should be '1' for beautiful1 and '0' for beautiful2
				if (str.charAt(i) != '1') {
					count0++; // Mismatch with beautiful1 (starting with '0')
				}
				if (str.charAt(i) != '0') {
					count1++; // Mismatch with beautiful2 (starting with '1')
				}
			}
		}

		// Return the minimum of the two mismatch counts
		return Math.min(count0, count1);
	}

	// Main method to read input and output the result
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read input string
		String str = sc.nextLine();

		// Call the method and print the result
		System.out.println(makeBeautiful(str));

		// Close the scanner
		sc.close();
	}
}
