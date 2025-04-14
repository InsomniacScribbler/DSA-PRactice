package Arrays;

import java.util.Arrays;

public class reverse_array {
	public static int [] reverse (int arr[]){
		int end = arr.length-1,start =0;
		while(start < end){
			arr[start] ^= arr[end];
			arr[end] ^= arr[start];
			arr[start] ^= arr[end];
			start++;end--;
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverse(new int[]{32,55,23,56,12})));
	}
}
