package Arrays;

import java.util.Arrays;

public class RotateArray{
	
	public static void reverse(int[]arr,int i,int j) {	
		while (i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}	
	}
	public static int[] Rotate(int[]arr, int k) {
		k = k%arr.length;
		if (k<0)  k=k+arr.length;
		int n = arr.length;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {3,2,4,5,7,3,5,7};	
		
		System.out.println(Arrays.toString(Rotate(arr, 3)));
	}
}
