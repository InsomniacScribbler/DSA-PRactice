import java.util.*;

public class AnagramsGrouped {

	public static ArrayList<ArrayList<String>> getGroupedAnagrams(ArrayList<String> inputStr, int n) {
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		ArrayList<ArrayList<String>> result = new ArrayList<>();

		for (String str : inputStr) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = new String(charArray);

			if (!map.containsKey(sortedStr)) {
				map.put(sortedStr, new ArrayList<>());
			}
			map.get(sortedStr).add(str);
		}

		for (ArrayList<String> group : map.values()) {
			result.add(group);
		}
		return result;
	}


	public static void main(String[] args) {
		// Hardcoded input
		ArrayList<String> inputStr = new ArrayList<>(Arrays.asList(
				"eat", "tea", "tan", "ate", "nat", "bat"
		));
		int n = inputStr.size();

		// Call function
		ArrayList<ArrayList<String>> groupedAnagrams = getGroupedAnagrams(inputStr, n);
		System.out.println(getGroupedAnagrams(inputStr, n));
		// Print result

	}
}
