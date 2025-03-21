package Arr2d;

public class Matrix2 {
	public static int indexofarr(int[][] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
				
				}
		//  System.out.println(max);
		return new int[] (i-1,j-1);
		
			}
	
		
	
	public static void main(String[] args) {
		
		int[][] arr= {{3,1,2},{4,9,5},{8,1,3}};
		//int temp=indexofarr(arr);
		//System.out.println(temp);
		System.out.println(indexofarr(arr));
		
		

	}
}
