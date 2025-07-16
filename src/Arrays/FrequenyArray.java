package Arrays;

public class FrequenyArray {
	
	public static int[] frequency(int[] nums) {
		int[] freq = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			int count = 0;
			if (freq[i]!=-1) {
				for (int j = 0; j < nums.length; j++) {
					if (nums[i]==nums[j]) {
						count++;
						freq[j] = -1;
					}
				}
			}
			freq[i] = count;
		}
		return freq;
	}
	public static void main(String[] args) {
		int[] arr = {1,6,2,9,1,4,6,2,9};
		int[] ans = frequency(arr);
		
		for (int i = 0; i < ans.length; i++) {
			if (ans[i]!=0) {
				System.out.print(ans[i]);
			}
		  }
	}
}

