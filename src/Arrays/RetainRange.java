package Arrays;

import java.util.Arrays;

/*
  retain the range and remove all other elements 
  other than given range.
 */
public class RetainRange {
	public static  int[] retainRange(int[]nums,int st,int end) {
		int[] ans = new int[end-st+1];
		
		for (int i = 0,j=0; i < nums.length; i++) {
			if(i>=st && i<= end) {
				ans[j] = nums[i];
				j++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int nums[] = {11,21,31,41,51,61,71};
		System.out.println(Arrays.toString(retainRange(nums, 0, 1)));
	}
}
