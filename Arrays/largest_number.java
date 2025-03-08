public class largest_number {
	public static  int num(int arr[]){
		int max = Integer.MIN_VALUE;
		for(int x:arr) {
			max = (x > max) ? x : max;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(num(new int[]{12,43,54,2,34,56}));
	}

}
