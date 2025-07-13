package Arrays;

public class ThirdMin {

	public static int thirdMin(int[] nums)
	{
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]<min) {
				thirdMin = secMin;
				secMin = min;
				min = nums[i];
			}
			else if (nums[i]<secMin) {
				thirdMin = secMin;
				secMin = nums[i];
			}
			else if (nums[i]<thirdMin) {
				thirdMin = nums[i];
			}
		}
		return thirdMin;
	}
	public static void main(String[] args) {
		int [] arr = {2,4,3,5,45,62,33,8};
		System.out.println(thirdMin(arr));
	}
}
