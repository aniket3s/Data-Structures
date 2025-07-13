package Arrays;

import java.util.Arrays;

public class AddElemAtIdx {
	public static int[] addElement(int[] nums,int idx,int elemnt)
	{
		int[] ans = new int[nums.length+1];
		for (int i = 0; i < ans.length; i++) {
			 if (i<idx) {
				ans[i] = nums[i];
			} else if(i== idx){
				ans[i] = elemnt;
			}else {
				ans[i] = nums[i-1];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {42,56,74,34,22,4};
		System.out.println(Arrays.toString(addElement(arr, 0, 5)));
	}
}
