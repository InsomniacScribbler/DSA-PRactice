import java.util.Scanner;

public class search {
	public static int linear_Search(int arr[], int key){
		int flag = -1;
		for (int x=0; x<arr.length; x++){
			if( arr[x] == key)
			{
				flag = x;
				break;
			}

		}
		return flag;

	}

	public static void main(String[] args) {
		System.out.println(linear_Search(new int[]{1,3,5,7,9,11}, 9));

	}
}
