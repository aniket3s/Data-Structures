package Arrays;

public class ThirdMax {
	public static int thirdMaximum(int[] nums)
	{
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		 for(int i =0;i<nums.length;i++)
		 {
			 if (nums[i]>max) {
				thirdMax = secMax;
				secMax = thirdMax;
				max = nums[i];
			}
			else if (nums[i]>secMax){
				 thirdMax = secMax;
				 secMax = nums[i];
			 }
			else if(nums[i]>thirdMax)
			{
				thirdMax = nums[i];
			}
		 }
		 return thirdMax;
	}
	public static void main(String[] args) {
		int [] arr = {4,7,65,32,45,98,21};
		System.out.println(thirdMaximum(arr));
	}
}
