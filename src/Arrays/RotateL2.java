package Arrays;

import java.util.Arrays;

public class RotateL2 {

	public static int[] rotate(int[] a ,int times) {
		
		for (int i = 0; i < times; i++) {
			int temp = a[a.length-1];
			for (int j = a.length-1;j>=1;j--) {
				a[j] = a[j-1];
			}
			a[0] = temp;
		}
		return a;
	}
	public static int[] moveZeroes(int[] nums) {
	       Arrays.sort(nums);
	       int i =0;
	       while(nums[i]==0)
	       {
	        int temp = nums[0];
	         for(int j=0;j<nums.length-1;j++)
	         {
	            nums[j]=nums[j+1];
	         }
	        nums[nums.length-1] = temp;
	       }
	       return nums;
	    }
	public static void main(String[] args) {
		int[] a = {0,1,0,3,12};
		int k = 2;
		System.out.println(Arrays.toString(rotate(a, k)));
		System.out.println(Arrays.toString(moveZeroes(a)));
	}
}
