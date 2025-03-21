package Arr2d;

public class SumRowCol {
public static void main(String[] args) {
		
		int[][] arr= {{3,1,2},{4,9,5},{8,1,3}};
		
		//for sum of column
		for(int i=0;i<arr.length;i++) {
			int rowsum=0;
			for(int j=0;j<arr.length;j++) {
				
					rowsum+=arr[i][j];
				
			}System.out.println(rowsum);
				
				}
		//for sum of column
		for(int j=0;j<arr.length;j++) {
			int colsum=0;
			
			for(int i=0;i<arr.length;i++) {
				
				colsum+=arr[i][j];
					
			}System.out.println(colsum);
		}
		}
}

