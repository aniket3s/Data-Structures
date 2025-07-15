package Arrays;

import java.util.Arrays;

public class RotateArray {

	public static int[] rotateArray(int[]nums, int k) {
		reverse(nums, 0, nums.length-k-1);
		reverse(nums, nums.length-k, nums.length-1);
		
		return reverse(nums,0,nums.length-1);
	}
	
	public static int[] reverse(int[] nums,int i, int j) {
		while(i<j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;		
		}
		return nums;
	}
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7};
		int k = 3;
		System.out.println(Arrays.toString(rotateArray(nums,k)));
	}
}
