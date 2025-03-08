public class arraypairs {
	public static void pairs(int arr[]){
		for (int x = 0; x< arr.length; x++){
			for(int y = x+1;y<arr.length; y++){
				System.out.print(arr[x]+","+arr[y]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pairs(new int[]{2,4,6,8,10});
	}
}
