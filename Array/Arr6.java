package Array;

import java.util.Arrays;

public class Arr6 {
	public static void main(String[] args) {
		int[] arr= {2,3,7,8,5,9,4};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		int b= Arrays.binarySearch(arr,4);
		System.out.println(b);
		
		int[] arr2=Arrays.copyOf(arr, 12);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3=Arrays.copyOfRange(arr2,2,7);
		System.out.println(Arrays.toString(arr3));
		
	}

}
