package Arrays;

import java.util.Arrays;

/* substract a2 array from a1
  
   a2 -   2 4 3 0 1 3
   a1 -       2 5 6 7 
   -------------------
   diff-  2 4 0 4 4 6                                                                                 */
   


public class Subtraction {

	public static int[] ansArray(int[] a2,int[] a1)
	{
		
		int diff[] = new int[a1.length];
		int i = a1.length-1;
		int j = a2.length-1;
		int k = diff.length-1;
		
		int c = 0;
		
		
		while(k>=0)
		{
			int d = 0;
			int a1v = i >= 0 ? a1[i] : 0;
			
			if(a2[j]+c >= a2[j])
			{
				d = a2[j] + c - a1v;
				c = 0;
			}
			else {
				d = a2[j]+c+10 - a1v;
				c = -1;
			}
			
			diff[k] = d;
			k--;
			i--;
			j--;
		}
		int index = 0;
		while (index<diff.length) {
			if (diff[index]==0) {
				index++;
			}else {
				break;
			}
		}
		while(index<diff.length) {
			System.out.println(diff[index]);
		}
		return diff;
	}
	public static void main(String[] args) 
	{
		int[] a2 = {2,4,3,0,1,3};
		int[] a1 = {2,5,6,7};
		

		System.out.println(Arrays.toString(ansArray(a2,a1)));
	}
}
