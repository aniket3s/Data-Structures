package Array;

import java.util.Arrays;

public class ZigZag{
	
	public static int[] zigzagArr(int[] a , int[] b)
	{
		int[] zigzag = new int[a.length+b.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(k < a.length + b.length)
		{
			if(i<a.length)
			{
				zigzag[k] = a[i]; 
				i++;
				k++;
			}
			if(j<b.length)
			{
				zigzag[k] = b[j];
				j++;
				k++;
			}
		}
		return zigzag;
	}
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = {10,20,30,40,50,60,70};
		
		System.out.println(Arrays.toString(zigzagArr(arr, arr2)));
	}
 }
