package Arrays;

public class MissingNumber {

	public static int missingNumber(int[]a)
	{
		int sum1 = 0;
		int num = a[0];
		int sum2 = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum1 += num;
			sum2 += a[i];
			num++;
		}
		sum1+= num++;
		return sum1-sum2;
	}
	
	public static void main(String[] args)
	{
		int [] a = {2,3,4,5,7};
		System.out.println(missingNumber(a));
	}
}
