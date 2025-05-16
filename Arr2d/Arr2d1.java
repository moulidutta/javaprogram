package Arr2d;

import java.util.Scanner;

public class Arr2d1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		
		//input from user
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
				}
			}
		
	//output
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			System.out.println(arr[i][j]);
			}
		}
	}

}
