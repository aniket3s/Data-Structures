package twoDarray;

import java.util.Arrays;

public class SumofTwoMatrices {

	public static int[][] sum(int a[][] ,int b[][])
	{
		int rows = a.length;
		int cols = a[0].length;
		
		int [][] c = new int[rows][cols];
		
		if (a.length == b.length && a[0].length == b[0].length) {

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					c[i][j] = a[i][j] + b[i][j];
				}
			}
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		 int[][] A = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        int[][] B = {
		            {9, 8, 7},
		            {6, 5, 4},
		            {3, 2, 1}
		        }; 
		        
		       int[][] c = sum(A, B);
		       for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length; j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
 	}
}
