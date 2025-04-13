import java.util.* ;
import java.io.*;

public class minParentheses {
	public static int minimumParentheses(String pattern) {
		int open = 0, close = 0, n = pattern.length();

		for (int i = 0; i < n; i++) {
			if (pattern.charAt(i) == '(') {
				open++;  // Increase open count for '('
			} else if (pattern.charAt(i) == ')') {
				if (open > 0) {
					open--;  // Matching '(' for this ')'
				} else {
					close++; // Unmatched closing parenthesis
				}
			}
		}

		// Return the number of unmatched parentheses
		return open + close;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = sc.nextLine();  // Read the input string
		System.out.println(minimumParentheses(pattern));  // Output the result
		sc.close();
	}
}
