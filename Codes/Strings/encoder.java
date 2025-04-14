package Strings;

import java.util.*;

public class encoder {

	// Function to perform Run-Length Encoding
	public static String encode(String message) {
		int count = 1;
		message = message.trim();

		if (message.length() == 0) {
			return "";
		}

		StringBuilder encoded = new StringBuilder();

		for (int i = 1; i < message.length(); i++) {
			if (message.charAt(i) == message.charAt(i - 1)) {
				count++;
			} else {
				encoded.append(message.charAt(i - 1)).append(count);
				count = 1;
			}
		}

		// Append the last character and its count
		encoded.append(message.charAt(message.length() - 1)).append(count);

		return encoded.toString();
	}

	// Main method to handle input/output
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());  // Number of test cases

		for (int i = 0; i < T; i++) {
			String message = sc.nextLine();
			System.out.println(encode(message));
		}

		sc.close();
	}
}
