package Arrays;
import java.util.Arrays;

public class FrequenyArray {
	
	public static int[] frequency(int[] nums) {
		int[] count = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			int ct = 0;
			if (count[i]!=-1) {
				for (int j = i+1; j < nums.length; j++) {
					if (nums[i]==nums[j]) {
						ct++;
						count[j] = -1;
					}
				}
				count[i] = ct;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {1,6,2,9,1,4,6,2,9,8,1,8};
		int[] count = frequency(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(count));
	}
}

