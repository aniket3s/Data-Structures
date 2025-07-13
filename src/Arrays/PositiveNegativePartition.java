package Arrays;

import java.util.Arrays;

public class PositiveNegativePartition {
	
	public static int[] partition(int[] nums)
	{
		int i = 0, j = nums.length-1;
		while(nums[i]<0){
			i++;
		}
		while (nums[j]>0) {
			j--;
		}
		if (i<j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
		return nums;
	}
	
	
	public static void main(String[] args)
	{
		int arr[] = {-1,-2,3,4,-5,6,-7};
		
		System.out.println(Arrays.toString(partition(arr)));
	}

}
