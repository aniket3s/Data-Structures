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
	public static void Rotate(int[]arr, int k) {
		int n = arr.length;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
	}
	public static void main(String[] args) {
		int[] arr = {3,2,4,5,7,3,5,7};	
		Rotate(arr,3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
