package Arrays;

import java.util.Arrays;

public class PatchArray {
	public static int[] patchArray(int[] nums1,int[] nums2,int idx)
	{
		int[] ans = new int[nums1.length+nums2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<nums1.length) {
			if (i<idx) {
				ans[k] = nums1[i];
				i++;
			} else if(j<=idx){
				ans[k] = nums2[j];
				j++;
			}else {
				ans[k] = nums1[i];
				i++;
			}
			k++;
		}
		return ans;
	}
	public static void main(String[] args) {
		int num1[] = {10,20,30,40,50};
		int num2[] = {100,200,300,400};
		int idx = 3;
		System.out.println(Arrays.toString(patchArray(num1, num2, idx)));
	}
}
