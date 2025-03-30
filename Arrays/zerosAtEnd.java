import java.util.Arrays;

class zeroToEnd {
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

public class zerosAtEnd {
	public static void main(String[] args) {
		// Predefined input array
		int[] arr = {3, 0, 1, 0, 9, 0, 5};

		// Call the solution method
		zeroToEnd sol = new zeroToEnd();
		sol.pushZerosToEnd(arr);

		// Print the modified array
		System.out.println(Arrays.toString(arr));
	}
}