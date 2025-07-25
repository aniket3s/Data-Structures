package twoDarray;

public class SumOfElements {

	public static int sumOfTwoDArray(int[][]arr)
	{
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum = sum +  arr[i][j];
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int [][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		System.out.println(sumOfTwoDArray(arr));
	}
}
