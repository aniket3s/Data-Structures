package Arrays;

import java.util.Arrays;

public class SingleReverseMerge {
	
	public static int[] mergeArray(int[] a,int[] b)
	{
		int[] merge = new int[a.length+b.length];
		
		int i=0 , j = 0;
		
		for (int k = 0;k<merge.length;k++)
		{
			if(i<a.length) 
			{
				merge[k]=a[i]; 
				i++;
			}
			else
			{
				merge[k] = b[j];
				j++;
			}
		}
		return merge;
	}
	
	public static int[] reverse(int[] arr)
	{
		int n = arr.length;
		for(int i =0 ; i<n/2;i++)
		{
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-1-i] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8};
		int b[] = {10,20,30,40,50,60};
		int[] rev = reverse(b);
		System.out.println(Arrays.toString(mergeArray(a,rev)));
 	}
}
