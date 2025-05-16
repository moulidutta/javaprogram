package Arr2d;
public class Matrix {
	//find max element
	public static void main(String[] args) {
	
		int[][] arr= {{3,1,2},{4,9,5},{8,1,3}};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
				
				}
		System.out.println(max);
		
			}

}
