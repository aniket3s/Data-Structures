package Arrays;

import java.util.Arrays;

public class RemoveElement {

	public static int[] remove(int[] nums,int elemnt)
	{
		int[] ans = new int[nums.length-1];
		int j =0;
		boolean flag = false;
		while(j<nums.length) 
		{
			if(nums[j]==elemnt)
			{
				flag =true;
				j++;
			}
			if(flag && j<nums.length) 
				ans[j-1] = nums[j];
			else if(j<nums.length)  
				ans[j] = nums[j];
			j++;
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = {2,3,6,8,9,10};
		int elemnt = 10;
		System.out.println(Arrays.toString(remove(nums, elemnt)));
	}
 }
