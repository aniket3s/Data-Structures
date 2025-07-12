package Array;

import java.util.Arrays;

public class ReverseArray {
	
	
	public static int[] reverseArray(int[] arr){
		int n = arr.length;
		 int [] rev = new int[n];
		 for (int i = n-1; i >= 0 ; i--) {
			rev[i] = arr[n-1-i];
		}
		return rev;
	}
	
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40};
		System.out.println(Arrays.toString(reverseArray(arr)));
	}
	
}
