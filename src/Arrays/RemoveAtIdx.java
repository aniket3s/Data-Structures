package Arrays;
import java.util.Arrays;

public class RemoveAtIdx {
	public static int[] removeIdx(int[]nums,int idx)
	{
		int[] ans = new int[nums.length-1];
		
		for (int i = 0; i < ans.length; i++) {
			if (i>=idx && i< nums.length) {
				ans[i] = nums[i+1];
			}else {
				ans[i] = nums[i];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = {4,8,3,5,6,1};
		int idx = 5;
		System.out.println(Arrays.toString(removeIdx(nums, idx)));
	}

}
