package Array;

public class SumOddEven {
	
	static int oddSum = 0;
	static int evenSum = 0;
	
	public static int evenSum(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0)  {
				evenSum+= arr[i];
			}
		}
		return evenSum;
	}
	
	public static int oddSum(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0 ) oddSum+= arr[i];
		}
		return oddSum;
	}
	
	public static void main(String[] args)
	{
		int [] arr = {4,5,8,10,57,64,12,10,45,1};
		System.out.println("EvenSum = "+evenSum(arr)); // 108
		System.out.println("OddSum = "+oddSum(arr));   // 62
		
		if (evenSum == oddSum) {
			System.out.print(evenSum == oddSum);
		}
	}
}
