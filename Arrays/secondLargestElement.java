import java.util.Scanner;
import java.util.Arrays;

class Solution {
	void pushZerosToEnd(int[] arr) {
		int n = arr.length;
		int count = 0;
		for(int x = 0 ; x < n; x++){
			if(arr[x] != 0){
				arr[count] = arr[x];
				count++;
			}
		}
		while(count < n){
			arr[count] = 0;
			count++;
		}
	}
}

public class secondLargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Solution sol = new Solution();
		sol.pushZerosToEnd(arr);
		System.out.println(Arrays.toString(arr));
	}
}