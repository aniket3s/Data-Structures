package Array;

import java.util.Arrays;

public class PositiveNegativePartition {
	
	public static int[] ans2(int[] a)
	{
		int i = 0, j = a.length-1;
		
		
		while(i<=j)
		{
			
			if (a[i] > 0 && a[j] < 0 ){
				i++;
				j--;
			}
			if(a[i]<0 && a[j]<0) j--;
			
			if(a[i]>0 && a[j]>0) i++;
			
			if(a[i]<0 && a[j]<0){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return a;
	}
	
	public static int[] ans(int[] a)
	{
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i]<0) {
				for (int j = i+1; j < a.length; j++) {
					if (a[j]>0) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args)
	{
		int arr[] = {-1,-2,3,4,-5,6,-7};
		System.out.println(Arrays.toString(ans(arr)));
		System.out.println(Arrays.toString(ans2(arr)));
	}

}
