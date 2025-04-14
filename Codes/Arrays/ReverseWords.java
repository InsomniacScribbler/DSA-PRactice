package Arrays;

public class ReverseWords {

	// Method 1: Reverse words using array reversal (your approach)
	static String reverseStringWordWise(String input) {
		// Trim leading/trailing spaces and split by one or more spaces
		String[] str = input.trim().split("\\s+");
		int n = str.length;

		// Swap elements from start and end to reverse the array
		for (int i = 0; i < n / 2; i++) {
			String temp = str[i];
			str[i] = str[n - 1 - i];
			str[n - 1 - i] = temp;
		}

		// Join the reversed array back into a string
		return String.join(" ", str);
	}

    /*
    // Method 2: Using StringBuilder (previous approach)
    static String reverseStringWordWise(String input) {
        input = input.trim();  // Remove extra spaces
        String[] words = input.split("\\s+");  // Split by one or more spaces
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) reversed.append(" ");
        }

        return reversed.toString();
    }
    */

	// Driver code to test the function
	public static void main(String[] args) {
		String input1 = "   Hello   World   Java  ";
		String input2 = "Data Structures and Algorithms";

		System.out.println("Input 1: \"" + input1 + "\"");
		System.out.println("Reversed: \"" + reverseStringWordWise(input1) + "\"");

		System.out.println("\nInput 2: \"" + input2 + "\"");
		System.out.println("Reversed: \"" + reverseStringWordWise(input2) + "\"");
	}
}
