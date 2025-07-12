package Array;

import java.util.Arrays;

public class MergeTwoArrays {
	
	public static int[] mergedArray(int[] a , int[] b)
	{
		int[] ans = new int[a.length+b.length];
		
		for (int i = 0; i < a.length; i++) {
			ans[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			ans[a.length+i] = b[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int [] a = {2,54,6,5,7,3,5,6};
		int [] b = {2,65,34,46,456,57,567,57};
		
		System.out.println(Arrays.toString(mergedArray(a,b)));
	}
}
