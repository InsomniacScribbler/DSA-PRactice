package Arrays;
/*
Given an array arr. Your task is to find the minimum and maximum elements in the array.

Note: Return a Pair that contains two elements the first one will be a minimum element and the second will be a maximum.

Examples:

Input: arr[] = [3, 2, 1, 56, 10000, 167]
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.
*/
class Pair<U, V> {
    public final U first;
    public final V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}

public class MaxAndMinElementOfArray {

    public Pair<Integer, Integer> getMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new Pair<>(min, max);
    }

    // quick test
    public static void main(String[] args) {
        MaxAndMinElementOfArray obj = new MaxAndMinElementOfArray();
        int[] arr = {3, 2, 1, 56, 10000, 167};
        Pair<Integer, Integer> result = obj.getMinMax(arr);
        System.out.println("Min: " + result.first + ", Max: " + result.second);
    }
}
