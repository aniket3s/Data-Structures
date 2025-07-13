package Arrays;

import java.util.Arrays;

public class SliceArray {

	public static int[] sliceArray(int[] nums,int n1,int n2)
	{
		int[] ans = new int[nums.length-(n2-n1+1)];
		int k =0;
		for (int i = 0; i < nums.length; i++) {
			if (i<n1 || i>n2) {
				ans[k] = nums[i];
				k++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50,60};
		System.out.println(Arrays.toString(sliceArray(nums, 2, 3)));
	}
}
