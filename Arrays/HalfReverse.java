package Array;

import java.util.Arrays;

public class HalfReverse {

	public static int[] halfReverse(int[] arr)
	{
		int [] halfRev = new int[arr.length];
		int j = arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			if (i>=arr.length/2) {
				halfRev[i] = arr[j];
				j--;
			}
			else{
				halfRev[i] = arr[i];
			}
		}
		return halfRev;
	}
	
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50,60,70,80};
		System.out.println(Arrays.toString(halfReverse(arr)));
	}
}
