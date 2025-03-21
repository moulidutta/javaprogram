package Array;

import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array");
		int a=sc.nextInt();
		 
		double[] arr= new double[a];
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextDouble();
			System.out.println(arr[i]);
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
