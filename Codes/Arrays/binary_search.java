package Arrays;

public class binary_search {
	public static int search(int arr[], int key){
		int start = 0, end = arr.length-1;
		while(start <=end){
			int  mid = (start+end)/2;
			if(arr[mid] == key){
				return mid;
			}
			else if (arr[mid]<key) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(search(new int[]{12,23,34,45,56,67,78,89,90},78));
	}
}
